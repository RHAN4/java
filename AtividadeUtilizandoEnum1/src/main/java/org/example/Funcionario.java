package org.example;

public class Funcionario {
    private String ID;
    private String nome;
    Setores setores;
    private String salario;
    Generos generos;
    private String idade;

    public Funcionario(String ID, String nome, Setores setores, String salario, Generos generos, String idade) {
        this.ID = ID;
        this.nome = nome;
        this.setores = setores;
        this.salario = salario;
        this.generos = generos;
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setores getSetores() {
        return setores;
    }

    public void setSetores(Setores setores) {
        this.setores = setores;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Generos getGeneros() {
        return generos;
    }

    public void setGeneros(Generos generos) {
        this.generos = generos;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
