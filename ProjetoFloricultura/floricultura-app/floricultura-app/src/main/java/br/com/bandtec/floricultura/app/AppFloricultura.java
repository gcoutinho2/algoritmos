package br.com.bandtec.floricultura.app;

import br.com.bandtec.floricultura.enums.AgentePolinizador;
import br.com.bandtec.floricultura.enums.TipoFlor;
import br.com.bandtec.floricultura.modelo.Flor;
import br.com.bandtec.floricultura.modelo.Girassol;
import br.com.bandtec.floricultura.modelo.Lirio;
import br.com.bandtec.floricultura.modelo.Produto;
import br.com.bandtec.floricultura.modelo.Rosa;
import java.util.Scanner;

public class AppFloricultura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int flores = 0;
        Flor flor1 = null;
        Flor flor2 = null;

        while (flores < 2) {

            // nome da flor
            System.out.print("Qual o nome da flor que quer cadastrar? : ");
            String nomeFlor = leitor.next();

            // id da flor
            System.out.print("Qual o id para essa flor? (escolha de 1 a 9) : ");
            int idFlor = leitor.nextInt();

            // Tipo Flor - Rosa, Lirio ou Girassol
            System.out.println("Qual o tipo dessa flor que quer cadastrar? \n "
                    + "[1] - Rosa \n "
                    + "[2] - Lirio \n "
                    + "[3] - Girassol \n ");
            int tpFlor = leitor.nextInt();

            //Valor de compra
            System.out.print("Qual o valor de compra dessa flor? R$ ");
            double valorCompraFlor = leitor.nextDouble();

            //Raridade no mercado
            System.out.println("O quanto é fácil conseguir essa flor no mercado? \n "
                    + "[1] - Comum \n "
                    + "[2] - Nobre \n "
                    + "[3] - Rara \n ");
            int mercadoFlor = leitor.nextInt();

            // Switch case para raridade da flor
            TipoFlor raridade = null;
            switch (mercadoFlor) {
                case 1:
                    raridade = TipoFlor.COMUM;
                    break;
                case 2:
                    raridade = TipoFlor.NOBRE;
                    break;
                case 3:
                    raridade = TipoFlor.RARA;
                    break;
            }

            //Agente polinizador
            System.out.println("Qual o agente de polinização dessa flor?:\n"
                    + "[1] - Passáros \n "
                    + "[2] - Vento \n "
                    + "[3] - Morcegos \n "
                    + "[4] - Insetos \n "
                    + "[5] - Homem \n ");
            int polinizadorFlor = leitor.nextInt();

            // switch case para o agente polinizador
            AgentePolinizador polinizador = null;
            switch (polinizadorFlor) {
                case 1:
                    polinizador = AgentePolinizador.ORNITOFILA;
                    break;
                case 2:
                    polinizador = AgentePolinizador.ANEMOFILA;
                    break;
                case 3:
                    polinizador = AgentePolinizador.QUIROTEROFILA;
                    break;
                case 4:
                    polinizador = AgentePolinizador.ENTOMOFILA;
                    break;
                case 5:
                    polinizador = AgentePolinizador.ANTOPOFILA;
                    break;
            }

            // IF/ELSE para saber qual o TIPO DA FLOR(Girassol, Rosa ou Lirio)
            //ROSA
            if (tpFlor == 1) {
                if (flores == 0) {
                    flor1 = new Rosa(nomeFlor, polinizador);
                } else {
                    flor2 = new Rosa(nomeFlor, polinizador);
                }
            }

            //LIRIO
            if (tpFlor == 2) {
                if (flores == 0) {
                    flor1 = new Lirio(nomeFlor, polinizador);
                } else {
                    flor2 = new Lirio(nomeFlor, polinizador);
                }
            }

            //GIRASSOL
            if (tpFlor == 3) {
                if (flores == 0) {
                    flor1 = new Girassol(nomeFlor, polinizador);
                } else {
                    flor2 = new Girassol(nomeFlor, polinizador);
                }
            }

            //ADICIONANDO A FLOR AO PRODUTO
            if (flores == 0) {
                Produto prod1 = new Produto(idFlor, flor1, valorCompraFlor, raridade);
                System.out.println("Nome da primeira flor: " +prod1.getFlor().getNome()+
                        "\nDescrição do Agente Polinizador: " + prod1.getFlor().getAgentePolinizador().getDescricacao()+
                        "\nPreço de compra: R$" + prod1.getValorCompra()+
                        "\nPreço de venda: R$" + prod1.getPrecoVenda());
            } else {
                Produto prod2 = new Produto(idFlor, flor2, valorCompraFlor, raridade);
                System.out.println("Nome da segunda flor: " +prod2.getFlor().getNome()+
                        "\nDescrição do Agente Polinizador: " + prod2.getFlor().getAgentePolinizador().getDescricacao()+
                        "\nPreço de compra: R$" + prod2.getValorCompra()+
                        "\nPreço de venda: R$" + prod2.getPrecoVenda());
            }
            flores++;
        }
        
        

    }

}
