package com.mycompany.herancamuitacoisa;

public abstract class PessoaJuridica extends Pessoa {
    protected String CNPJ;
    protected String inscricaoEstadual;

    public PessoaJuridica(String CNPJ, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscricaoEstadual;
    }

   

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Dados da pessoa juridica: " 
                + "\nCNPJ: " + CNPJ 
                + "\nInscrição estadual: " + inscricaoEstadual;
    }
    
}
