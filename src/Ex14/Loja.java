package Ex14;

import javax.swing.JOptionPane;

// 14)Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e escrever: - o
// maior preço lido - a média aritmética dos preços dos produtos

public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = PegarListaDeProduto(15);
        float maiorValor = PegarMaiorValor(produtos);
        float media = PegarMedia(produtos);

        JOptionPane.showMessageDialog(null, String.format("Média é R$ %.2f e maior valor é R$ %.2f", media, maiorValor));
    }

    private static float PegarMaiorValor(Produto[] produtos){
        float maiorValor = 0;
        for (var produto : produtos){
            if (produto.Preco > maiorValor){
                maiorValor = produto.Preco;
            }
        }
        return maiorValor;
    }

    private static float PegarMedia(Produto[] produtos){
        float valorTotal = 0;
        for (var produto : produtos){
            valorTotal += produto.Preco;
        }
        return valorTotal / produtos.length;
    }

    private static Produto[] PegarListaDeProduto(int range) {
        Produto[] produtos = new Produto[range];
        for (int i = 0; i < range; i++) {
            produtos[i] = PegarProduto(i);
        }
        return produtos;
    }

    private static Produto PegarProduto(int index) {
        String[] entrada = JOptionPane
                .showInputDialog(null,
                        String.format("Digite o código e o preço do produto %d, separados por vírgula", index + 1))
                .split(",");
        int codigo = Integer.parseInt(entrada[0].trim());
        float preco = Float.parseFloat(entrada[1].trim());
        return new Produto(codigo, preco);
    }
}
