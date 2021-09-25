package Ex3;
// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
// mais uma comissão também fixa para cada carro vendido e 
// mais 5% do valor das vendas por ele efetuadas. 

import javax.swing.JOptionPane;

// Escrever um algoritmo que leia 
//      o número de carros por ele vendidos, 
//      o valor total de suas vendas, 
//      o salário fixo e 
//      o valor que ele recebe por carro vendido. 

//Calcule e escreva o salário final do vendedor.


public class Revendedora {
    public static void main(String[] args) {
        String[] result = JOptionPane.showInputDialog(
            null, 
            "Digite a quantidade de vendas, valor total, salario fixo, comissão fixa", 
            "Quantidade, Valor total, salário, comissão fixa")
            .split(",");

        int quantidadeDeVendas = Integer.parseInt(result[0]);
        float valorTotalDasVendas = Float.parseFloat(result[1]);
        float salarioFixo = Float.parseFloat(result[2]);
        float comissaoFixa = Float.parseFloat(result[3]);
        JOptionPane.showMessageDialog(
            null, 
            String.format("O salário a ser pago será R$ %.2f", 
                CalcularPagamento(
                    quantidadeDeVendas, 
                    valorTotalDasVendas, 
                    salarioFixo, 
                    comissaoFixa), 
            "Salário", 
            "info"));
    }

    private static float CalcularPagamento(int quantidadeVendas, float valorVendas, float salario, float comissao){
        return (float)(salario + (valorVendas*0.05) + (quantidadeVendas*comissao));
    }
}
