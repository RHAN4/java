package org.example;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("hahaha", "hihihi", "5", "10GB");
        PlacaMae placaMae = new PlacaMae("hehehe", "huhuhu", "sim");
        Memoria memoria = new Memoria("hohoho", "hyhyhy", "8Hz", "10GB");
        DispositivoDeArmazenamento dispositivoDeArmazenamento = new DispositivoDeArmazenamento("huashuhas", "hueshues",
                "sim");

        System.out.println("Informações dos produtos: ");
        System.out.println("\nProcessador: ");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getMarca());
        System.out.println("Frequência: " + processador.getFrequencia());
        System.out.println("Capacidade de armazenamento: " + processador.getCapacidadeArmaz());

        System.out.println("\nPlaca mãe: ");
        System.out.println("Marca: " + placaMae.getMarca());
        System.out.println("Modelo: " + placaMae.getMarca());
        System.out.println("Soquete: " + placaMae.getSoquete());

        System.out.println("\nMemoria: ");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Frequência: " + memoria.getFrequencia());
        System.out.println("Capacidade de armazenamento: " + memoria.getCapacidadeDeArmaz());

        System.out.println("\nDispositivo de armazenamento: ");
        System.out.println("Marca: " + dispositivoDeArmazenamento.getMarca());
        System.out.println("Modelo: " + dispositivoDeArmazenamento.getModelo());
        System.out.println("Tipo de conexão: " + dispositivoDeArmazenamento.getTipoDeConexao());
    }
}