package br.com.exemplo.funcionarios;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
    BigDecimal salario;
    String funcao;

    public Funcionario (String nome, String dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }
    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}
