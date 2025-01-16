public class CalculadoraTintas {

    private final double RENDIMENTO_POR_LITRO = 6.0;
    private final double PRECO_LATA = 80.0;
    private final double PRECO_GALAO = 25.0;
    private final double CAPACIDADE_LATA = 18.0;
    private final double CAPACIDADE_GALAO = 3.6;

    public double calcularLitrosNecessarios(double area){
        double litros = area / RENDIMENTO_POR_LITRO;
        return Math.ceil(litros * 1.1);
    }

    public String calcularApenasLatas(double litros){
        int quantidadeLatas = (int) Math.ceil(litros / CAPACIDADE_LATA);
        double custoTotal = quantidadeLatas * PRECO_LATA;
        return quantidadeLatas + " lata(s), Custo: R$ "+ custoTotal;
    }

    public String calcularApenasGaloes(double litros){
        int quantidadeGaloes = (int) Math.ceil(litros / CAPACIDADE_GALAO);
        double custoTotal = quantidadeGaloes * PRECO_GALAO;
        return quantidadeGaloes + " galão(ões), Custo: R$ " + custoTotal;
    }

    public String calcularMistura(double litros){
        int quantidadeLatas = (int) Math.ceil(litros / CAPACIDADE_LATA);
        double restante = litros % CAPACIDADE_LATA;
        int quantidadeGaloes = (int) Math.ceil(litros / CAPACIDADE_GALAO);
        double custoTotal = (quantidadeLatas * PRECO_LATA) + (quantidadeGaloes * PRECO_GALAO);
        return quantidadeLatas + " lata(s) e " + quantidadeGaloes + " galão(ões), Custo: R$ "+ custoTotal;
    }
}
