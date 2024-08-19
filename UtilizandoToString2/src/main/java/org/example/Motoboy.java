package org.example;

public class Motoboy extends Funcionario {
    private String CNH;

    public Motoboy(String nome, String CPF, String RG, String salario, String CNH) {
        super(nome, CPF, RG, salario);
        this.CNH = CNH;
    }

    @Override
    public String toString() {
        return "\nDados do motoboy: " +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nRG: " + RG +
                "\nSalario: " + salario +
                "\nCNH: " + CNH;
    }
}

