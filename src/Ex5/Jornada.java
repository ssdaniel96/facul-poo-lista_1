package Ex5;

import javax.swing.JOptionPane;

// A jornada de trabalho semanal de um funcionário é de 40 horas. 
// O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
// com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
// trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
// que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere
// que o mês possua 4 semanas exatas).


public class Jornada {
    public static void main(String[] args) {
        String[] entradas = JOptionPane.showInputDialog(null, "Digite as horas e o salário por hora,separadas por vírgula").split(",");
        int horas = Integer.parseInt(entradas[0].trim());
        int horasMensaisReferencial = 40*4;
        float salarioHora = Float.parseFloat(entradas[1].trim());

        float salario = horas * salarioHora;
        if (horas > horasMensaisReferencial){
            salario += (horas - horasMensaisReferencial) * (salarioHora / 2);
        }

        JOptionPane.showMessageDialog(null, String.format("Salário R$ %.2f", salario));
    }
}
