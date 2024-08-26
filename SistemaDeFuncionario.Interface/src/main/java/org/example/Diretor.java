package org.example;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Genero genero, Setores setores, double salarioBase) {
        super(nome, dataNascimento, genero, setores, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
    double salarioFinal = 0;
    salarioFinal = super.salarioBase * PREMIO;
    salarioFinal += super.salarioBase;
    return salarioFinal;
    }

    @Override
    public String toString() {
        return "Dados do diretor: " +
                "\nNome: " + nome +
                "\nData de nascimento: " + dataNascimento +
                "\nGênero: " + genero +
                "\nSetor: " + setores +
                "\nSalario base: " + salarioBase +
                "\nPrêmio: " + PREMIO;
    }


    @Override
    public void admitir(Funcionario funcionario) {
        
    }

    @Override
    public void demitir(Funcionario funcionario) {

    }
}
