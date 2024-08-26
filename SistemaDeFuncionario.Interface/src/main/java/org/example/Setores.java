package org.example;

public enum Setores {
    RECURSOS_HUMANO ("Recursos humanos."),
    FINANCEIRO ("Financeiro."),
    OPERACOES ("Operações");

    private String texto;

    Setores(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
