package Ex20;

import javax.swing.JOptionPane;

// 20)Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e
// escrever se existem números repetidos no vetor VET e em que posições se
// encontram

public class Vetor {
    public static void main(String[] args) {
        int[] vetor = PreencherVetor(50);
        ImprimirRepeticoes(vetor);

    }

    private static void ImprimirRepeticoes(int[] array){
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if (i == j){
                    continue;
                }

                if (array[i] == array[j]){
                    System.out.println(String.format("Repetição encontrada do valor %d, na posição %d e %d", array[i], i, j));
                }
            }
        }        
    }

    private static int[] PreencherVetor(int range){
        int[] vetor = new int[range];
        for(int i=0;i<range;i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %dº elemento", i+1)));
        }
        return vetor;
    }
}
