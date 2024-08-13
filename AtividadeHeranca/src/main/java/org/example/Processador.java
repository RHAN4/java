package org.example;

public class Processador extends Descricao {
    private String frequencia;
    private String capacidadeArmaz;

    public Processador(String marca, String modelo, String frequencia, String capacidadeArmaz) {
        super(marca, modelo);
        this.frequencia = frequencia;
        this.capacidadeArmaz = capacidadeArmaz;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getCapacidadeArmaz() {
        return capacidadeArmaz;
    }

    public void setCapacidadeArmaz(String capacidadeArmaz) {
        this.capacidadeArmaz = capacidadeArmaz;
    }
}
