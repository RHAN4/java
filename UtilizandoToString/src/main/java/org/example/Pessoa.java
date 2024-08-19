package org.example;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;


    // Construtor com passagem de parâmetros
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Metodo de acesso (Getter and Setter)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
