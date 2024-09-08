public class Internacional extends Produto {
    public Internacional(String descricao, double preco, String regiao) {
        super(descricao, preco, regiao);
    }
    //Calculando a taxa.
    public double taxa(){
        double taxa = preco * 0.05;
        return taxa;
    }
    //Calculando a taxa de imporatação.
    public double taxaImportacao(){
        double taxaimpor = preco * 0.05;
        return taxaimpor;
    }
    //Calculando o preço final.
    @Override
    public double precofinalin(){
        double precofinalin = taxa() + imposto() + taxaImportacao() + preco;
        return precofinalin;
    }
}