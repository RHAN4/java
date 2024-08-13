package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("1457", "fulano", Setores.FINANCEIRO,
                "5.000", Generos.MASCULINO, "45");

        System.out.println("Informações sobre o funcionario: ");
        System.out.println("ID: " + funcionario1.getID());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetores());
        System.out.println("Gênero: " + funcionario1.getGeneros());
        System.out.println("Idade: " + funcionario1.getIdade());


    }
}