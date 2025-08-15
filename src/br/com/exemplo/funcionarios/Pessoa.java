package br.com.exemplo.funcionarios;

import java.time.LocalDate;

public class Pessoa {
    String nome;
    LocalDate dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}
