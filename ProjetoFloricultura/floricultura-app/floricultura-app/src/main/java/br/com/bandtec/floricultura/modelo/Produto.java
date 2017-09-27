package br.com.bandtec.floricultura.modelo;

import br.com.bandtec.floricultura.enums.TipoFlor;

public class Produto {
    
    private Integer id;
    private Flor flor;
    private Double valorCompra;
    private TipoFlor tipoFlor;

    //construtor
    public Produto(Integer id, Flor flor, Double valorCompra, TipoFlor tipoFlor) {
        this.id = id;
        this.flor = flor;
        this.valorCompra = valorCompra;
        this.tipoFlor = tipoFlor;
    }

    public Integer getId() {
        return id;
    }

    public Flor getFlor() {
        return flor;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public TipoFlor getTipoFlor() {
        return tipoFlor;
    }
    
    
    public double getPrecoVenda(){
        return (this.valorCompra * this.tipoFlor.getMargemLucro())/100;
    }
    
    

}
