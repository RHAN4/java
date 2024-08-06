package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nomeUsuario = "Marta";
        int senha = 123;

        // Comparação de Strings e inteiros

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        // Exibindo resultados

        System.out.println("O nome do usuário está correto: " + resultadoNome);
        System.out.println("A senha está correta: " + resultadoSenha);
    }
}