package org.example;

public enum Generos {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String texto;

    private Generos(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
