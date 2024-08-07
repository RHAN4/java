package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String login = "martinha78";
     String senha = "12345";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu login: ");
        login = teclado.next();

        System.out.println("Digite a sua senha: ");
        senha = teclado.next();

        if (Objects.equals(login, "martinha78") && Objects.equals(senha, "12345")) {
            System.out.println("Bem-vindo, usuário logado!!");
        } else {
            System.out.println("Login ou senha inválidos.");
        }
    }
}