package org.example;

public class Memoria extends Descricao {
    private String frequencia;
    private String capacidadeDeArmaz;

    public Memoria(String marca, String modelo, String frequencia, String capacidadeDeArmaz) {
        super(marca, modelo);
        this.frequencia = frequencia;
        this.capacidadeDeArmaz = capacidadeDeArmaz;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getCapacidadeDeArmaz() {
        return capacidadeDeArmaz;
    }

    public void setCapacidadeDeArmaz(String capacidadeDeArmaz) {
        this.capacidadeDeArmaz = capacidadeDeArmaz;
    }
}
