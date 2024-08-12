package org.example;

public class Funcionario {
    private String codigoDeFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBanco;

    public Funcionario(String codigoDeFuncionario, String nome, String endereco, String telefone, String email) {
        this.codigoDeFuncionario = codigoDeFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public String getCodigoDeFuncionario() {
        return codigoDeFuncionario;
    }

    public void setCodigoDeFuncionario(String codigoDeFuncionario) {
        this.codigoDeFuncionario = codigoDeFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }
}
