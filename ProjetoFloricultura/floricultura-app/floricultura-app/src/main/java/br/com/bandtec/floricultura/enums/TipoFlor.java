
package br.com.bandtec.floricultura.enums;



public enum TipoFlor {
    
    COMUM(10.0),
    NOBRE(25.0),
    RARA(50.0);
    
    private Double margemLucro;

    private TipoFlor(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }
    
    
    
}
