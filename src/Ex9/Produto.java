package Ex9;

import javax.swing.JOptionPane;

// Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
// o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
// unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
// que:
// ● Se quantidade <= 5 o desconto será de 2%
// ● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// ● Se quantidade > 10 o desconto será de 5%

public class Produto {
    public static void main(String[] args) {
        String[] entrada = JOptionPane
                .showInputDialog(null, "Digite o nome, quantidade, preço, em ordem e separado por vírgulas").split(",");
        String descricao = entrada[0];
        int quantidade = Integer.parseInt(entrada[1].trim());
        float preco = Float.parseFloat(entrada[2].trim());

        JOptionPane.showMessageDialog(null, String.format("O valor total de %s é R$ %.2f", descricao, CalcularValor(preco, quantidade)));

    }

    private static float CalcularValor(float valor, int quantidade) {   
        valor *= quantidade;

        if (quantidade > 10) {
            return valor * 0.95f;
        }

        if (quantidade > 5) {
            return valor * 0.97f;
        }

        return valor * 0.98f;
    }
}
