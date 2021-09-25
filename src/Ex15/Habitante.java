package Ex15;

public class Habitante {
    public float Salario;
    public int QuantidadeDeFilhos;

    public Habitante(float salario, int quantidadeDeFilhos) {
        Salario = salario;
        QuantidadeDeFilhos = quantidadeDeFilhos;
    }
    
    public boolean EhOSalárioMenor(float valor){
        return Salario < valor;
    }
}
