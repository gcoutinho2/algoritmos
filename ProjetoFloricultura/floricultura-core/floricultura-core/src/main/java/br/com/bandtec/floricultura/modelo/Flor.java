package br.com.bandtec.floricultura.modelo;

import br.com.bandtec.floricultura.enums.AgentePolinizador;

public abstract class Flor {

    protected String nome;
    protected AgentePolinizador agentePolinizador;

    //construtor
    public Flor(String nome, AgentePolinizador agentePolinizador) {
        this.nome = nome;
        this.agentePolinizador = agentePolinizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AgentePolinizador getAgentePolinizador() {
        return agentePolinizador;
    }

    public void setAgentePolinizador(AgentePolinizador agentePolinizador) {
        this.agentePolinizador = agentePolinizador;
    }

    public abstract String getCorPetalas();

}
