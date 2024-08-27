package org.example;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Resultado da soma: " + soma.calcular(5.0, 4.0));
        System.out.println("Resultado da subtração: " + subtracao.calcular(5.0, 2.0));
        System.out.println("Resultado da multiplicação: " + multiplicacao.calcular(5.0, 3.0));
        System.out.println("Resultado da divisão: " + divisao.calcular(5.0, 5.0));
    }
}