package org.example;

import org.example.ContaBancaria;
import org.example.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("7845", "ciclano", "avenida 8",
                "71985746325", "ciclano@gmail.com");
        ContaBancaria conta = new ContaBancaria("bradesco", "8596", "44444",
                "corrente", "5.000", "10.000");

        System.out.println("\nDados do funcionário: ");
        System.out.println("Código do funcionário: " + funcionario1.getCodigoDeFuncionario());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        System.out.println("Telefone: " + funcionario1.getTelefone());
        System.out.println("Email: " + funcionario1.getEmail());

        System.out.println("\nDados bancários do funcionário: ");
        System.out.println("Banco: " + conta.getBanco());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da conta: " + conta.getNumeroDaConta());
        System.out.println("Tipo de corrente: " + conta.getTipoDaConta());
        System.out.println("Saldo atual: " + conta.getSaldoAtual());
        System.out.println("Limite disponível: " + conta.getLimiteDisponivel());
    }
}