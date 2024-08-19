package org.example;

public abstract class Funcionario {
    protected String nome;
    protected String CPF;
    protected String RG;
    protected String salario;

    public Funcionario(String nome, String CPF, String RG, String salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
