package org.example;

public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "Quá!";
    }

    @Override
    public String comer() {
        return "Peixe.";
    }
}
