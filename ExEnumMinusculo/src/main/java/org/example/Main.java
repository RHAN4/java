package org.example;

public class Main {
    public static void main(String[] args) {
        Clientes cliente = new Clientes("Marta", Genero.FEMININO);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Gênero: " + cliente.getGenero().getTexto());
    }
}