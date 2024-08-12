package org.example;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroDaConta;
    private String tipoDaConta;
    private String saldoAtual;
    private String limiteDisponivel;

    public ContaBancaria(String banco, String agencia, String numeroDaConta, String tipoDaConta, String saldoAtual, String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
