package br.com.coutinho.enums;

public enum TipoCartao {
    CREDITO("Crédito"),
    DEBITO("Débito"),
    VR("Vale Refeição"),
    VA("Vale Alimentação");
    
    String descricao;

    private TipoCartao(final String descricao) {
        this.descricao = descricao;
    }
    
    
}
