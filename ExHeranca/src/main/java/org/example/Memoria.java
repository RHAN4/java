package org.example;

public class Memoria extends Produto {
    private String capacidadeArmaz;

    public Memoria(String marca, String modelo, String capacidadeArmaz) {
        super(marca, modelo);
        this.capacidadeArmaz = capacidadeArmaz;
    }

    public String getCapacidadeArmaz() {
        return capacidadeArmaz;
    }

    public void setCapacidadeArmaz(String capacidadeArmaz) {
        this.capacidadeArmaz = capacidadeArmaz;
    }
}
