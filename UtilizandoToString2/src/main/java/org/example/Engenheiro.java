package org.example;

public class Engenheiro extends Funcionario {
    private String CREA;

    public Engenheiro(String nome, String CPF, String RG, String salario, String CREA) {
        super(nome, CPF, RG, salario);
        this.CREA = CREA;
    }

    @Override
    public String toString() {
        return "\nDados do engenheiro: " +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nRG: " + RG +
                "\nSalario: " + salario +
                "\nCREA: " + CREA;

    }
}
