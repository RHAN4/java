package com.mycompany.herancamuitacoisa;

public class PrestacaoServico extends PessoaJuridica {
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim, String CNPJ, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(CNPJ, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }
    

    @Override
    public String toString() {
        return super.toString() +
                "\nServiço prestado:  " 
                + "\nInicio do contrato: " + contratoInicio + 
                   "\nFim do contrato: " + contratoFim;
    }
}
