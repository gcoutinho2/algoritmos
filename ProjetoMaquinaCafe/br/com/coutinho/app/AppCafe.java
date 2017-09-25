package br.com.coutinho.app;

import br.com.coutinho.modelo.CafeBarato;
import br.com.coutinho.modelo.CafeChique;
import br.com.coutinho.modelo.MaquinaCafe;

public class AppCafe {

    public static void main(String[] args) {
        MaquinaCafe cafeBarato = new CafeBarato(2);
        MaquinaCafe cafeChique = new CafeChique(1);

        System.out.println("Qtd Porções café barato: " + cafeBarato.getPorcoes());
        System.out.println("Qtd Porções café chique: " + cafeChique.getPorcoes());

        System.out.println(cafeBarato.produzirExpresso(1.5));
        System.out.println("Qtd Porções café barato: " + cafeBarato.getPorcoes());
        System.out.println(cafeBarato.produzirExpresso(1.5));
        System.out.println("Qtd Porções café barato: " + cafeBarato.getPorcoes());
        System.out.println(cafeBarato.produzirExpresso(1.5));
    }
}
