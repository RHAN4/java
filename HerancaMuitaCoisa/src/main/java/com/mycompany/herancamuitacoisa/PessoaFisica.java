package com.mycompany.herancamuitacoisa;

public abstract class PessoaFisica extends Pessoa {
    Generos genero;
    EstadoCivil estadoCivil;
    protected String dataNascimento;

    public PessoaFisica(Generos genero, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }


    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Dados da pessoa fisica: {" 
                + "Gênero: " + genero 
                + "Estado civil: " + estadoCivil 
                + "Data de nascimento: " + dataNascimento;
    }
    
}
