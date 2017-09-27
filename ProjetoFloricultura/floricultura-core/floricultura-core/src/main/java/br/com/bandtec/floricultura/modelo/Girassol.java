package br.com.bandtec.floricultura.modelo;

import br.com.bandtec.floricultura.enums.AgentePolinizador;

public class Girassol extends Flor {

    public Girassol(String nome, AgentePolinizador agentePolinizador) {
        super(nome, agentePolinizador);
    }

    @Override
    public String getCorPetalas() {
        return "Amarelo";
    }

}
