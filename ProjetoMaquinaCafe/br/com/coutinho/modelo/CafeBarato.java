package br.com.coutinho.modelo;

public class CafeBarato extends MaquinaCafe {

    public CafeBarato(int porcoes) {
        super(porcoes);
    }

    @Override
    protected String getMensagem() {
        return "Café simples saindo..";
    }

    @Override
    public boolean validarCredito(double credito) {
        return credito >= 1.5;
    }

}
