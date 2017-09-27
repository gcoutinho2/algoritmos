package br.com.bandtec.floricultura.modelo;

import br.com.bandtec.floricultura.enums.AgentePolinizador;

public class Lirio extends Flor {

    public Lirio(String nome, AgentePolinizador agentePolinizador) {
        super(nome, agentePolinizador);
    }

    @Override
    public String getCorPetalas() {
        return "Branco";
    }

}
