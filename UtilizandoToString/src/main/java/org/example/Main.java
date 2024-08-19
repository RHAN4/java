package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Juridica pessoaJuridica = new Juridica("Marta LTDA", "71988451596",
                "59456277/0001-76", "55555");
        Fisica pessoaFisica = new Fisica("Marta", "71910748539", "058369014-00",
                "27415916614", "11/05/2000");

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }
}