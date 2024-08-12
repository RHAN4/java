package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("fulano", "30", "123.456.789-00", "rua 7",
                "71988537496");
        Veiculo veiculo1 = new Veiculo("74859", "rosa choque", "5", "100 litros",
                "255 km/h",
                "5l/kmh");

        System.out.println("Dados do cliente e seu veículo: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCPF());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("\n");
        System.out.println("Veículo:");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Número de passageiros: " + veiculo1.getNumPassageiros());
        System.out.println("Capacidade do tanque: " + veiculo1.getCapacidadeDoTanque());
        System.out.println("Velocidade máxima: " + veiculo1.getVelocidadeMax());
        System.out.println("Consumo em média: " + veiculo1.getCosumoEmMedia());

    }
}