package Ex10;

import javax.swing.JOptionPane;

// Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO,
// deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor
// zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
// (utilizar a estrutura REPITA).

public class Valores {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: ")); 
        int valor2 = PegarValorNaoZero();
        JOptionPane.showMessageDialog(null, String.format("Valor 1: %d, Valor 2: %d", valor1, valor2));
    }

    private static int PegarValorNaoZero(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
        if (valor == 0){
            JOptionPane.showMessageDialog(null, "Não pode ser 0!");
            return PegarValorNaoZero();
        }
        return valor;
    }
}
