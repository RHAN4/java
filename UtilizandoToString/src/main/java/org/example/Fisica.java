package org.example;

public class Fisica extends Pessoa {
    private String CPF;
    private String RG;
    private String dataNascimento;

    // Construtor para passagem de parametros
    public Fisica(String nome, String telefone, String CPF, String RG, String dataNascimento) {
        super(nome, telefone);
        this.CPF = CPF;
        this.RG = RG;

        this.dataNascimento = dataNascimento;
    }

    // toString
    @Override
    public String toString() {
        return "\nDados de pessoa fisica: " +
                "\nNome = " + nome +
                "\nTelefone = " + telefone +
                "\nCPF = " + CPF +
                "\nRG = " + RG +
                "\nData nascimento = " + dataNascimento;
    }
}
