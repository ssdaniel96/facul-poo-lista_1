package Ex18;

import javax.swing.JOptionPane;

// 18)Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir
// o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor

public class Q {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        for(int n = 0; n < numeros.length; n++){
            numeros[n] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o numero %d", n+1)));
        }   

        int maior = 0;
        int posMaior = 0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                posMaior = i;
            }
        }

        System.out.println(String.format("Maior número = %d", maior));
        System.out.println(String.format("No index = %d", posMaior));
    }

}
