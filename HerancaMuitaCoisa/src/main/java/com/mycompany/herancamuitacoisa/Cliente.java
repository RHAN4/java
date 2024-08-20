package com.mycompany.herancamuitacoisa;

public class Cliente extends PessoaFisica {
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Generos genero, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Protocolo de atendimento: " + protocoloAtendimento;
    }
    
}

