package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa cliente = new Pessoa("7485", "fulano", "41", "7188745269",
                "fulano@gmail.com", Generos.MASCULINO);
        Endereco residencia = new Endereco("rua 5", "08",
                "caminho 2", "74857-214", "Salvador", UnidadeFederativa.BAHIA);

        System.out.println("Informações: ");
        System.out.println("ID: " + cliente.getID());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Gênero: " + cliente.getGenero().getTexto());
        System.out.println("\nEndereço: ");
        System.out.println("Logradouro: " + residencia.getLogradouro());
        System.out.println("Número da casa: " + residencia.getNumeroDaCasa());
        System.out.println("Complemento: " + residencia.getComplemento());
        System.out.println("CEP: " + residencia.getCEP());
        System.out.println("Cidade: " + residencia.getCidade());
        System.out.println("Unidade Federativa: " + residencia.getUF().getTexto() +", "+ residencia.getUF().getSigla());

    }
}