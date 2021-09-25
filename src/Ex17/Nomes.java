package Ex17;

import javax.swing.JOptionPane;

// 17)Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os
// nomes lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1
// nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome estiver
// entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso
// contrário.

public class Nomes {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        for (int i=0;i<nomes.length; i++){
            nomes[i] = JOptionPane.showInputDialog(null, String.format("Digite o nome da pessoa %d", i+1));
        }

        String nomeFiltro = JOptionPane.showInputDialog(null, "Digite um nome para buscar: ");
        boolean encontrado = false;
        for (var nome : nomes){
            if (nomeFiltro.equals(nome)){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, "Achei");
            return;
        }

        JOptionPane.showMessageDialog(null, "Não achei");
        
    }
}
