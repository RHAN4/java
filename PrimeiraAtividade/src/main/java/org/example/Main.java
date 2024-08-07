package org.example;

public class Main {
    public static void main(String[] args) {
    Livros livro1 = new Livros("hahaha", "fulano", 100, 20);
    Livros livro2 = new Livros("hihihi", "ciclano",172, 40);

        System.out.println("\nDados do primeiro livro:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Nome do autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumPaginas());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("\nDados do segundo livro:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Nome do autor: " + livro2.getAutor());
        System.out.println("Número de páginas: " + livro2.getNumPaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}