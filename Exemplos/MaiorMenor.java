/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class MaiorMenor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      int menor;
              
      System.out.println("Informe o primeiro número: ");
      int numeroUm = teclado.nextInt();
      
      System.out.println("Informe o segundo número: ");
      int numeroDois = teclado.nextInt();
      
      if (numeroUm > numeroDois){
          menor = numeroDois;
      } else {
          menor = numeroUm;
      }
        System.out.println("O menor número entre os digitados é: " + menor);
    }
}
