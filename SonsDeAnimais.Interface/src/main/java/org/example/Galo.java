package org.example;

public class Galo implements Animal {
    @Override
    public String emitirSom() {
        return "Cócó!";
    }

    @Override
    public String comer() {
        return "Milho.";
    }
}
