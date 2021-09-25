package Ex13;

import javax.swing.JOptionPane;

// 13)Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
// um algoritmo que permita a entrada das seguintes informações: a) o número total de
// mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor
// total em estoque e a média de valor das mercadorias.


public class Loja {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos"));
        float[] valores = new float[quantidade];
        float soma = 0;
        for(int i=0; i<quantidade; i++){
            valores[i] = Float.parseFloat(JOptionPane.showInputDialog(null, String.format("Digite o valor da mercadora %d", i+1)));
            soma += valores[i];
        }

        System.out.println(String.format("A quantidade de itens no estoque é %d", quantidade));
        for (int i=0; i<quantidade;i++){
            System.out.println(String.format("Item %d, valor = R$ %.2f", i+1, valores[i]));
        }
        System.out.println(String.format("Média = %.2f", soma / quantidade));
    }
}
