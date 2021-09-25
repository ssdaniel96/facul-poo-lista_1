package Ex15;

import java.util.ArrayList;

import javax.swing.JOptionPane;

// 15)A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um
// algoritmos para coletar dados sobre o salário e número de filhos de cada habitante e
// após as leituras, escrever:
// a) Média de salário da população
// b) Média do número de filhos
// c) Maior salário dos habitantes
// d) Percentual de pessoas com salário menor que R$ 150,00
public class Prefeitura {
    public static void main(String[] args) {
        ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
        habitantes = PegarHabitantes(habitantes);
        var parametros = PegarParametros(habitantes);
        System.out.println(String.format("Média de salário da população = %.2f", parametros.MediaSalario));
        System.out.println(String.format("Maior salário da população = %.2f", parametros.MaiorSalario));
        System.out.println(String.format("Média de número filhos da população = %.2f", parametros.MediaNumeroFilhos));
        System.out.println(String.format("Média da população que recebe menos que R$ 150,00 = %.2f%%", parametros.PorcentagemPobres));
    }



    private static ValoresDTO PegarParametros(ArrayList<Habitante> habitantes){
        int quantidadeHab = habitantes.size();
        int pessoasPobres = 0;
        float soma = 0;
        float maior = 0;
        float somaFilhos = 0;
        for (var hab : habitantes){
            soma += hab.Salario;
            somaFilhos += hab.QuantidadeDeFilhos;
            if(maior < hab.Salario){
                maior = hab.Salario;
            }
            if(hab.EhOSalárioMenor(150)){
                pessoasPobres++;
            }
        }
        return new ValoresDTO(
            soma / quantidadeHab, 
            maior, 
            somaFilhos / quantidadeHab, 
            (pessoasPobres / quantidadeHab) * 100);
    }

    private static ArrayList<Habitante> PegarHabitantes(ArrayList<Habitante> habitantes) {
        habitantes.add(PegarHabitante());
        if (DesejaContinuar()){
            PegarHabitantes(habitantes);
        }
        return habitantes;
    }

    private static boolean DesejaContinuar() {
        return JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?",
                JOptionPane.YES_NO_OPTION);
    }

    private static Habitante PegarHabitante() {
        String[] entrada = JOptionPane
                .showInputDialog(null, "Digite o salário e a quantidade de filhos, separado por vírgula(,)").split(",");
        float salario = Float.parseFloat(entrada[0].trim());
        int quantidadeFilhos = Integer.parseInt(entrada[1].trim());
        return new Habitante(salario, quantidadeFilhos);
    }
}
