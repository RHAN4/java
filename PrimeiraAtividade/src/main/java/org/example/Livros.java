package org.example;

public class Livros {
    private String titulo;
    private String autor;
    private int numPaginas;
    private double preco;

    // Construtor
    public Livros(String titulo, String autor, int numPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.preco = preco;
    }

    // Método de acesso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
