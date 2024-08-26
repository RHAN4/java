package org.example;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Genero genero;
    protected Setores setores;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Genero genero, Setores setores, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setores = setores;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public Setores getSetores() {
        return setores;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double getSalarioFinal();
}
