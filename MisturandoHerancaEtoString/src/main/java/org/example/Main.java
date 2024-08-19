package org.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("7485", "Bernardo", "71988445620",
                new Endereco("Rua 7", "01", "Ao lado do deposito", "47852-963", "Salvador", UnidadeFederativa.BAHIA),
                "014852978-29", Generos.MASCULINO, "78564725814", "14/02/1994",
                "5000");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("8742", "Geraldo LTDA", "36014555",
                new Endereco("Avenida 45", "17", "Encima da fármacia", "49782-200", "Guarulhos", UnidadeFederativa.SAO_PAULO),
                "59456277/0001-76", "7452", LocalDate.MIN, LocalDate.MAX, "70.000");

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }
}