package org.example;

public class Veiculo {
    private String placa;
    private String cor;
    private String numPassageiros;
    private String capacidadeDoTanque;
    private String velocidadeMax;
    private String cosumoEmMedia;

    public Veiculo(String placa, String cor, String numPassageiros, String capacidadeDoTanque, String velocidadeMax, String cosumoEmMedia) {
        this.placa = placa;
        this.cor = cor;
        this.numPassageiros = numPassageiros;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMax = velocidadeMax;
        this.cosumoEmMedia = cosumoEmMedia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(String numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public String getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(String capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(String velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getCosumoEmMedia() {
        return cosumoEmMedia;
    }

    public void setCosumoEmMedia(String cosumoEmMedia) {
        this.cosumoEmMedia = cosumoEmMedia;
    }
}
