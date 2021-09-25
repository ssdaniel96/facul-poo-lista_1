package Ex1;

import javax.swing.JOptionPane;

// Escreva um algoritmo para ler o número total de eleitores de um município, o
// número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada
// um representa em relação ao total de eleitores.
public class Eleicao {
    public static void main(String[] args) {
        String message = "Digite, em ordem e separado por vírgulas, o total de votos brancos, nulos e válidos";
        String[] result = JOptionPane.showInputDialog(null, message, "Exemplo: 2, 3, 5").split(",");
        int[] votos = new int[result.length];
        int total = 0;
        for (int i = 0; i < votos.length; i++) {
            votos[i] = Integer.parseInt(result[i].trim());
            total += votos[i];
        }

        System.out.println("Resultado das eleições: ");
        System.out.println(String.format("Votos brancos: %.2f%%", CalcPorcentage(votos[0], total)));
        System.out.println(String.format("Votos nulos: %.2f%%", CalcPorcentage(votos[1], total)));
        System.out.println(String.format("Votos válidos: %.2f%%", CalcPorcentage(votos[2], total)));
    }

    private static float CalcPorcentage(float value, float total){
        return (value / total) * 100;
    }
}