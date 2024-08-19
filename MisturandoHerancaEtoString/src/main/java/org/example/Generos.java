package org.example;

public enum Generos {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String texto;

    Generos(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
