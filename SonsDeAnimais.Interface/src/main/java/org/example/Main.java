package org.example;

public class Main {
    public static void main(String[] args) {
        Cachorro spike = new Cachorro();
        Gato filo = new Gato();
        Galo carijo = new Galo();
        Pato donald = new Pato();

        System.out.println("\nCachorro: ");
        System.out.println("Som: " + spike.emitirSom());
        System.out.println("Alimentação: " + spike.comer());
        System.out.println("\nGato: ");
        System.out.println("Som: " + filo.emitirSom());
        System.out.println("Alimentação: " + filo.comer());
        System.out.println("\nGalo: ");
        System.out.println("Som: " + carijo.emitirSom());
        System.out.println("Alimentação: " + carijo.comer());
        System.out.println("\nPato: ");
        System.out.println("Som: " + donald.emitirSom());
        System.out.println("Alimentação: " + donald.comer());

    }
}