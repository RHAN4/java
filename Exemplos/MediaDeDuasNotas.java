/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediadeduasnotas;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class MediaDeDuasNotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    int notaUm, notaDois, media;
    String nome;
        System.out.println("Informe o seu nome: ");
        nome = teclado.next();
        
        System.out.println("Informe a primeira nota: ");
        notaUm = teclado.nextInt();
        
        System.out.println("Informe a segunda nota: ");
        notaDois = teclado.nextInt();
        
        media = (notaUm + notaDois) / 2;
        
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        if (media > 7) {
            System.out.println("Aprovado");
        }
        if (media < 7) {
            System.out.println("Reprovado");
        }
    }
}
