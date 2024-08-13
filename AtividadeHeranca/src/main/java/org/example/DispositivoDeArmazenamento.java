package org.example;

public class DispositivoDeArmazenamento extends Descricao {
    private String tipoDeConexao;
    private String capacidadeAmarz;

    public DispositivoDeArmazenamento(String marca, String modelo, String tipoDeConexao) {
        super(marca, modelo);
        this.tipoDeConexao = tipoDeConexao;
        this.capacidadeAmarz = capacidadeAmarz;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeAmarz() {
        return capacidadeAmarz;
    }

    public void setCapacidadeAmarz(String capacidadeAmarz) {
        this.capacidadeAmarz = capacidadeAmarz;
    }
}
