public class Nacional extends Produto {
    double taxa;
    public Nacional(String descricao, double preco, String regiao) {
        super(descricao, preco, regiao);
    }
    //Calculando a taxa.
    public double taxa(){
        double taxa = preco * 0.05;
        return taxa;
    }
    //Calculando o preço final.
    @Override
    public double precofinalna() {
        double precofinalna = taxa() + imposto() + preco;
        return precofinalna;
    }
}
