package org.example;

import java.time.LocalDate;

public class PessoaJuridica extends PessoaGeral {
    private String CNPJ;
    private String inscricaoEstadual;
    LocalDate dataInicio;
    LocalDate dataTermino;
    private String valorContrato;

    public PessoaJuridica(String ID, String nome, String telefone, Endereco endereco, String CNPJ, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, String valorContrato) {
        super(ID, nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return  "\nDados de pessoa juridica: " +
                "\nID: " + ID +
                "\nCNPJ: " + CNPJ +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\n\nDados do endereço: " + endereco +
                "\nInscricao estadual: " + inscricaoEstadual +
                "\nData de inicio: " + dataInicio +
                "\nData de término: " + dataTermino +
                "\nValor do Contrato: " + valorContrato;
    }
}
