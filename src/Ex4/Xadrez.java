package Ex4;
// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
// inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
// tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia
// e terminar no dia seguinte.

import javax.swing.JOptionPane;

public class Xadrez{
    public static void main(String[] args) {
        //considerando o maximo de dados 2 horas e a duração máximo 48 horas
        String[] result = JOptionPane.showInputDialog(
            null, 
            "Digite a hora de início e final (separada por víruglas", 
            "1, 3")
            .split(",");

        int horarioInicial = Integer.parseInt(result[0].trim());
        int horarioFinal = Integer.parseInt(result[1].trim());
        int horasTotais = horarioFinal <= horarioInicial ?
                          24 - (horarioInicial - horarioFinal) :
                          horarioFinal - horarioInicial;

        JOptionPane.showMessageDialog(null, String.format("Tempo total da partida foi %d horas", horasTotais));   
    }
}