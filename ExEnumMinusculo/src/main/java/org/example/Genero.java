package org.example;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
