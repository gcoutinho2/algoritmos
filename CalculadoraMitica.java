package calculadoramitica;

import javax.swing.JOptionPane;

public class CalculadoraMitica {

    public static void main(String[] args) {
        double soma = 0,sub = 0,mult = 0, div = 0, pot =0;
        
        String msgSoma = "",msgSub = "",msgMult = "",msgDiv = "",msgPot = "";

        for (int cont = 0; cont < 5; cont++) {
            String msg = "Qual operação deseja realizar?\n"
                    + "1. Adição\n"
                    + "2. Subtração\n"
                    + "3. Multiplicação\n"
                    + "4. Divisão\n"
                    + "5. Potência";

            String resp = JOptionPane.showInputDialog(msg);

            double num1 = Double.valueOf(JOptionPane.showInputDialog("Qual primeiro número?"));
            double num2 = Double.valueOf(JOptionPane.showInputDialog("Qual segundo número?"));
            String resposta = "";

            switch (resp) {
                //Operação de Adição
                case "1":
                    soma = num1 + num2;
                    msgSoma = num1 + " + " + num2 + " = " + soma;
                    
                   while (!resposta.equals("N") && !resposta.equals("S")) {
                        resposta = JOptionPane.showInputDialog("Deseja continuar? [S] ou [N]");
                        if (resposta.equals("N")) {
                        cont = 5;
                    }
                    }
                    break;
                //Operação de Subtração
                case "2":
                    sub = num1 - num2;
                    msgSub = num1 + " - " + num2 + " = " + sub;
                    
                    while (!resposta.equals("N") && !resposta.equals("S")) {
                        resposta = JOptionPane.showInputDialog("Deseja continuar? [S] ou [N]");
                        if (resposta.equals("N")) {
                        cont = 5;
                    }
                    }
                    break;

                //Operação de Multiplicação
                case "3":

                    mult = num1 * num2;
                    msgMult = num1 + " * " + num2 + " = " + mult;
                    while (!resposta.equals("N") && !resposta.equals("S")) {
                        resposta = JOptionPane.showInputDialog("Deseja continuar? [S] ou [N]");
                        if (resposta.equals("N")) {
                        cont = 5;
                    }
                    }
                    break;

                //Operação de Divisão
                case "4":
                    while (num2 == 0) {
                        num2 = Double.valueOf(JOptionPane.showInputDialog("Qual segundo número?"));
                    }
                    div = num1 / num2;
                    msgDiv = num1 + " / " + num2 + " = " + div;
                    while (!resposta.equals("N") && !resposta.equals("S")) {
                        resposta = JOptionPane.showInputDialog("Deseja continuar? [S] ou [N]");
                        if (resposta.equals("N")) {
                        cont = 5;
                    }
                    }
                    break;

                //Operação de Potência
                case "5":
                    while (num2 == 1) {
                        num2 = Double.valueOf(JOptionPane.showInputDialog("Qual segundo número?"));
                    }

                    pot = Math.pow(num1, num2);
                    msgPot = num1 + " ^ " + num2 + " = " + pot;
                    while (!resposta.equals("N") && !resposta.equals("S")) {
                        resposta = JOptionPane.showInputDialog("Deseja continuar? [S] ou [N]");
                        if (resposta.equals("N")) {
                        cont = 5;
                    }
                    }
                    break;

            }
        }
        if (!msgSoma.equals("")) {
            System.out.println(msgSoma);
        }
        if (!msgSub.equals("")) {
            System.out.println(msgSub);
        }
        if (!msgMult.equals("")) {
            System.out.println(msgMult);
        }
        if (!msgDiv.equals("")) {
            System.out.println(msgDiv);
        }
        if (!msgPot.equals("")) {
            System.out.println(msgPot);
        }
    }

   

}
