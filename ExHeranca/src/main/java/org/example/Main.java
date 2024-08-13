package org.example;

import org.example.Memoria;
import org.example.Processador;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("AMD", "Ryzen 7", "3.5");
        Memoria memoria = new Memoria("Intel", "15", "8 GB");

        System.out.println("\nInformações sobre o processador: ");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequencia: " + processador.getFrequencia());

        System.out.println("\nInformações sobre a memoria: ");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de armazenamento: " + memoria.getCapacidadeArmaz());

    }
}