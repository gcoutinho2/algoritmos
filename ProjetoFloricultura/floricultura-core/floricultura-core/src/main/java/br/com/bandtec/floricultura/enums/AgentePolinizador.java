package br.com.bandtec.floricultura.enums;

public enum AgentePolinizador {

    ORNITOFILA("Ornitófila", "Polinizada por pássaros"),
    ANEMOFILA("Anemófila", "Polinizada pelo vento"),
    QUIROTEROFILA("Quiroterofila", "Polinizada por morcegos"),
    ENTOMOFILA("Entomófila", "Polinizaada por insetos"),
    ANTOPOFILA("Antopofila", "Polinizada pelo homem");

    private String tipo;
    private String descricacao;

    //construtor  
    private AgentePolinizador(String tipo, String descricacao) {
        this.tipo = tipo;
        this.descricacao = descricacao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricacao() {
        return descricacao;
    }

}
