package Ex11;

import javax.swing.JOptionPane;
// )Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
// Considere que o N será sempre maior que ZERO.

public class Numeros {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor acima de 1"));
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

}
