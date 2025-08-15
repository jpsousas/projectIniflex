package br.com.exemplo.funcionarios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // 3.1 – Inserir todos os funcionários
        funcionarios.add(new Funcionario("Maria", "2000-10-18", new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", "1990-05-12", new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", "1961-02-05", new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", "1988-10-14", new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", "1995-01-05", new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", "1999-11-19", new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", "1993-03-31", new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", "1994-07-08", new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", "2003-05-24", new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", "1996-09-02", new BigDecimal("2799.93"), "Gerente"));
        
        // 3.2 – Remover João
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase("João"));

        // 3.3 – Imprimir todos os funcionários formatados
        System.out.println("Todos os funcionários:");
        funcionarios.forEach(System.out::println);

        // 3.4 – Aumentar 10% do salário
        funcionarios.forEach(f -> f.setSalario(f.getSalario().multiply(new BigDecimal("1.10"))));

        // 3.5 – Agrupar por função
        Map<String, List<Funcionario>> porFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        // 3.6 – Imprimir agrupados por função
        System.out.println("\nAgrupados por função:");
        porFuncao.forEach((funcao, lista) -> {
            System.out.println("Função: " + funcao);
            lista.forEach(System.out::println);
        });

        // 3.8 – Aniversariantes nos meses 10 e 12
        System.out.println("\nAniversariantes em outubro e dezembro:");
        funcionarios.stream()
                .filter(f -> f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12)
                .forEach(System.out::println);

        // 3.9 – Funcionário com maior idade
        Funcionario maisVelho = funcionarios.stream()
                .min(Comparator.comparing(Funcionario::getDataNascimento))
                .orElse(null);
        if (maisVelho != null) {
            int idade = java.time.Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
            System.out.println("\nFuncionário mais velho: " + maisVelho.getNome() + ", Idade: " + idade + " anos");
        }

        // 3.10 – Lista por ordem alfabética
        System.out.println("\nOrdem alfabética:");
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .forEach(System.out::println);

        // 3.11 – Total dos salários
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("\nTotal de salários: R$" + java.text.NumberFormat.getInstance(Locale.forLanguageTag("pt-BR")).format(totalSalarios));

        // 3.12 – Quantos salários mínimos ganha cada funcionário
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("\nSalários mínimos de cada funcionário:");
        funcionarios.forEach(f -> {
            BigDecimal qtd = f.getSalario().divide(salarioMinimo, 2, java.math.RoundingMode.HALF_UP);
            System.out.println(f.getNome() + ": " + qtd + " salários mínimos");
        });
    }
}