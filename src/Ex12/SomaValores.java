package Ex12;

import javax.swing.JOptionPane;

public class SomaValores {
    public static void main(String[] args) {
        String[] entrada = JOptionPane.showInputDialog(null, "Digite 2 valores separados por vírgulas").split(",");
        int n1 = Integer.parseInt(entrada[0].trim());
        int n2 = Integer.parseInt(entrada[1].trim());
        int soma = 0;
        for (int n = n1; n <= n2; n++){
            soma += n;
        }
        JOptionPane.showMessageDialog(null, String.format("A soma de todo o intervalo é %d", soma));

    }
}
