package aula2.src.main.java.com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculoMedia {
    public static void main( String[] args ) {
        Scanner teclado = new Scanner(System.in);

        double primeiraNota, segundaNota, media;
        String nome, resultado;

        System.out.println( "Informe o seu nome: ");
        nome = teclado.next();

        System.out.println( "Informe a primeira nota: ");
        primeiraNota = teclado.nextDouble();

        System.out.println( "Informe a segunda nota: ");
        segundaNota = teclado.nextDouble();

        media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}
