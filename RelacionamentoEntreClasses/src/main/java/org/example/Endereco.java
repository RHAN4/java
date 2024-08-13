package org.example;

public class Endereco {
    private String logradouro;
    private String numeroDaCasa;
    private String complemento;
    private String CEP;
    private String cidade;
    private UnidadeFederativa UF;

    public Endereco(String logradouro, String numeroDaCasa, String complemento, String CEP, String cidade, UnidadeFederativa UF) {
        this.logradouro = logradouro;
        this.numeroDaCasa = numeroDaCasa;
        this.complemento = complemento;
        this.CEP = CEP;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(String numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUF() {
        return UF;
    }

    public void setUF(UnidadeFederativa UF) {
        this.UF = UF;
    }
}
