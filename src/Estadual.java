public class Estadual extends Produto{
    public Estadual(String descricao, double preco, String regiao) {
        super(descricao, preco, regiao);
    }
    @Override
    public double precofinales(){
        double precofinales = imposto() + preco;
        return precofinales;
    }
}