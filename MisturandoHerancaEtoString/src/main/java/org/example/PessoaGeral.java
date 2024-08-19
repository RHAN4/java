package org.example;

public abstract class PessoaGeral {
    protected String ID;
    protected String nome;
    protected String telefone;
    Endereco endereco;

    public PessoaGeral(String ID, String nome, String telefone, Endereco endereco) {
        this.ID = ID;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
