package org.example;

public class Medico extends Funcionario {
    private String CRM;

    public Medico(String nome, String CPF, String RG, String salario, String CRM) {
        super(nome, CPF, RG, salario);
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "\nDados do medico: " +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nRG: " + RG +
                "\nSalario: " + salario +
                "\nCRM: " + CRM;

    }
}
