package org.example;

public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Genero genero, Setores setores, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, genero, setores, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salarioBase * ;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\nDados do motoboy: " +
                "\nTipo de carteira de habilitação: " + carteiraDeHabilitacao +
                "\nNome: " + nome +
                "\nData de nascimento: " + dataNascimento +
                "\nGênero: " + genero +
                "\nSetor: " + setores +
                "\nSalario base: " + salarioBase;
    }
}
