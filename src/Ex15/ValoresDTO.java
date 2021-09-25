package Ex15;

public class ValoresDTO{
    public float MediaSalario;
    public float MaiorSalario;
    public float MediaNumeroFilhos;
    public float PorcentagemPobres;

    public ValoresDTO(float mediaSalario, float maiorSalario, float mediaNumeroFilhos, float porcentagemPobres) {
        MediaSalario = mediaSalario;
        MaiorSalario = maiorSalario;
        MediaNumeroFilhos = mediaNumeroFilhos;
        PorcentagemPobres = porcentagemPobres;
    }
}