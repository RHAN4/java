package org.example;

public class Endereco {
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String CEP;
    protected String cidade;
    UnidadeFederativa uf;

    public Endereco(String logradouro, String numero, String complemento, String CEP, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return
                "\nLogradouro: " + logradouro +
                "\nNumero: " + numero +
                "\nComplemento: " + complemento +
                "\nCEP: " + CEP +
                "\nCidade: " + cidade +
                "\nUF:" + uf;
    }
}
