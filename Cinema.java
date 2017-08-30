package cinema;

import javax.swing.JOptionPane;

public class Cinema {

   
    public static void main(String[] args) {
        int fil = Integer.valueOf(JOptionPane.showInputDialog("Quantas fileiras existem?"));
        int pol = Integer.valueOf(JOptionPane.showInputDialog("Quantas poltronas existem?"));

        double valorIngresso = Double.valueOf(JOptionPane.showInputDialog("Qual o valor do ingresso?"));
        double total = 0;

        int vendas = fil * pol;
        int cont = 0;

        int[][] cinema = new int[fil][pol];

        while (cont < vendas) {
            int respFil = Integer.valueOf(JOptionPane.showInputDialog("Qual a fileira (1-" + (fil) + ")"));
            int respPol = Integer.valueOf(JOptionPane.showInputDialog("Qual a poltrona (1-" + (pol) + ")"));
            while (respPol < 1 || respPol > (pol + 1) || respFil < 1 || respFil > (fil + 1)) {
                JOptionPane.showMessageDialog(null, "Poltrona Inválida");
                respFil = Integer.valueOf(JOptionPane.showInputDialog("Qual a fileira (1-" + (fil) + ")"));
                respPol = Integer.valueOf(JOptionPane.showInputDialog("Qual a poltrona (1-" + (pol) + ")"));
            }
            --respFil;
            --respPol;
            int passagemEncontrada = cinema[respFil][respPol];

            if (passagemEncontrada == 0) {

                String msg = "1. Inteira\n"
                        + "2. Meia\n"
                        + "3. Convite";
                String respPag = JOptionPane.showInputDialog(msg);

                switch (respPag) {
                    case "1":
                        cinema[respFil][respPol] = 1;
                        total += valorIngresso;
                        cont++;

                        break;
                    case "2":
                        cinema[respFil][respPol] = 1;
                        total += valorIngresso / 2;
                        cont++;

                        break;
                    case "3":
                        cinema[respFil][respPol] = 1;
                        total += 0;
                        cont++;
                        break;
                }

            } else {

                JOptionPane.showMessageDialog(null, "Essa poltrona já foi vendida");

            }
        }

        JOptionPane.showMessageDialog(null, "Você arrecadou um total de R$" + total + " com os ingressos");
    }
}
