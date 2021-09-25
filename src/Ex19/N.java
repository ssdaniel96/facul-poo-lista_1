package Ex19;

import javax.swing.JOptionPane;

// 19)Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores).
// Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um
// terceiro vetor Soma a soma dos elementos do vetor A com os do vetor B (respeitando
// as mesmas posições) e escrever o vetor Soma.


public class N {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho dos arrays"));
        int[] array1 = PreencherVetor(n);
        int[] array2 = PreencherVetor(n);
        int[] arrayS = SomarArray(array1, array2);
        ImprimirArray(arrayS);
    }

    private static void ImprimirArray(int[] array){
        for(int num : array){
            System.out.println(num);
        }
    }

    private static int[] PreencherVetor(int range){
        int[] vetor = new int[range];
        for(int i=0;i<range;i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %dº elemento", i+1)));
        }
        return vetor;
    }

    private static int[] SomarArray(int[] array1, int[] array2){
        int[] arraySomado = new int[array1.length];
        for (int i=0; i < arraySomado.length; i++){
            arraySomado[i] = array1[i] + array2[i];
        }
        return arraySomado;
    }
}
