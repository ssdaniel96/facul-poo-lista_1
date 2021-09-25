package Ex6;

import javax.swing.JOptionPane;

// Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e
// escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de
// cada lado deve ser menor que a soma dos outros 2 lados.

public class Triangulo {
    public static void main(String[] args) {
        String[] entrada = JOptionPane.showInputDialog(null, "Digite os valores dos 3 lados separados por vírugla").split(",");
        float[] lados = new float[3];
        float valorReferencia = 0;
        for (int i=0; i<3; i++){
            lados[i] = Float.parseFloat(entrada[i].trim());
            valorReferencia += lados[i];
        }
        valorReferencia /= 2;

        boolean existeLadoInvalido = false;
        float ladoInvalido = 0;
        for (float lado : lados){
            if (lado >= valorReferencia){
                existeLadoInvalido = true;
                ladoInvalido = lado;
                break;
            } 
        }

        if (existeLadoInvalido){
            JOptionPane.showMessageDialog(null, String.format("Existe um lado invaldo de valor %.2f", ladoInvalido));
            return;
        }

        JOptionPane.showMessageDialog(null, "Formam um triangulo");



    }
}
