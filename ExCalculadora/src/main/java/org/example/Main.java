package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(5, 2));
        System.out.println(calculadora.calcular(5.0, 2.0));

    }
}