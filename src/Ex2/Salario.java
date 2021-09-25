package Ex2;
// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o
// percentual de reajuste. Calcular e escrever o valor do novo salário.

import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salário", "Salário"));
        float reajuste = 1 + Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o reajuste", "Reajuste"))/100;
        JOptionPane.showMessageDialog(null, String.format("Seu novo salário será R$ %.2f", salario * reajuste));
    }
}
