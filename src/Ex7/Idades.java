package Ex7;

import javax.swing.JOptionPane;

/*
Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que
as idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
Calcule e escreva 
    a soma das idades do homem mais velho com a mulher mais nova, e 
    o produto das idades do homem mais novo com a mulher mais velha.
*/

public class Idades {

    public static void main(String[] args) {
        String textoEntrada = "Digite em ordem as idades dos homens (2 idades) e depois das mulheres (2 idades), separados por vírgula";
        String[] entrada = JOptionPane
                .showInputDialog(null, textoEntrada, "idade homem, idade homem, idade mulher, indade mulher")
                .split(",");
        int[] idadeMulheres = new int[2];
        int[] idadeHomems = new int[2];

        for (int i = 0; i < 4; i++) {
            if (i <= 1) {
                idadeHomems[i] = Integer.parseInt(entrada[i].trim());
            } else {
                idadeMulheres[i-2] = Integer.parseInt(entrada[i].trim());
            }
        }

        idadeHomems = OrdernarMenorMaior(idadeHomems);
        idadeMulheres = OrdernarMenorMaior(idadeMulheres);

        int somaHomemVelhoMulherNova = idadeHomems[1] + idadeMulheres[0];
        int produtoHomemNovoMulherVelha = idadeHomems[0] * idadeMulheres[1];

        JOptionPane.showMessageDialog(null, String.format("A soma é %d", somaHomemVelhoMulherNova));
        JOptionPane.showMessageDialog(null, String.format("O produto é %d", produtoHomemNovoMulherVelha));
    }

    private static int[] OrdernarMenorMaior(int[] array){
        boolean mudado = false;
        for(int i=0; i<array.length; i++){
            if (i+1 == array.length){
                break;
            }

            if (array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }

        if (mudado){
            return OrdernarMenorMaior(array);
        }
        return array;
    }
}
