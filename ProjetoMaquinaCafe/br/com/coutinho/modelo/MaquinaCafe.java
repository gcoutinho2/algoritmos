package br.com.coutinho.modelo;

public abstract class MaquinaCafe {

    private int porcoes;

    public int getPorcoes() {
        return porcoes;
    }

    public MaquinaCafe(int porcoes) {
        this.porcoes = porcoes;
    }

    public abstract boolean validarCredito(double credito);

    protected abstract String getMensagem();

    public String produzirExpresso(double credito) {
        if (this.porcoes == 0) {
            return "Não há mais café na máquina";
        } else {
            if (this.validarCredito(credito)) {
                this.porcoes--;
                return getMensagem();
            } else {
                return "Valor insuficiente para comprar o café";
            }
        }
    }

}
