package org.example;

public class Juridica extends Pessoa {
    private String CNPJ;
    private String inscricaoEstadual;

    // Construtor pra passagem dos parâmetros
    public Juridica(String nome, String telefone, String CNPJ, String inscricaoEstadual) {
        super(nome, telefone);
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // ToString
    @Override
    public String toString() {
        return "\nDados de pessoa juridica: " +
                "\nNome = " + nome +
                "\nTelefone = " + telefone +
                "\nCNPJ = " + CNPJ +
                "\nInscricao estadual = " + inscricaoEstadual;

    }
}
