package br.com.coutinho.modelo;

import br.com.coutinho.enums.TipoCartao;

public class Compra {

    final protected Integer id;

    final protected double valorTotal;

    final protected TipoCartao tipoCartao;

    public Compra(Integer id, double valorTotal, TipoCartao tipoCartao) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.tipoCartao = tipoCartao;
    }

    public Integer getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

}
