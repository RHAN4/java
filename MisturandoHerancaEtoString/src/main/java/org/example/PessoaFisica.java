package org.example;

public class PessoaFisica extends PessoaGeral {
    private String CPF;
    Generos genero;
    private String RG;
    private String dataNascimento;
    private String salario;

    public PessoaFisica(String ID, String nome, String telefone, Endereco endereco, String CPF, Generos genero, String RG, String dataNascimento, String salario) {
        super(ID, nome, telefone, endereco);
        this.CPF = CPF;
        this.genero = genero;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nDados de pessoa física: " +
                "\nID: " + ID +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nCPF: " + CPF +
                "\n\nDados do endereço: " + endereco +
                "\nGênero: " + genero +
                "\nRG: " + RG +
                "\nData de nascimento: " + dataNascimento +
                "\nSalario: " + salario;
    }
}
