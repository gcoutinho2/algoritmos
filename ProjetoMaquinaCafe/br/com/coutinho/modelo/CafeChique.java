package br.com.coutinho.modelo;

public class CafeChique extends MaquinaCafe {

    public CafeChique(int porcoes) {
        super(porcoes);
    }

    @Override
    protected String getMensagem() {
        return "Café chique saindo, patrão!";
    }

    @Override
    public boolean validarCredito(double credito) {
        return credito >= 4;
    }

}
