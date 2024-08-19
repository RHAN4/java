package org.example;

public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");

    private String texto;

    UnidadeFederativa(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
