import java.util.ArrayList;

public class Produto {
    String descricao;
    double preco;
    String regiao;
    ArrayList<Produto> produtos;

    public Produto(String descricao, double preco, String regiao) {
        this.descricao = descricao;
        this.preco = preco;
        this.regiao = regiao;
        produtos = new ArrayList<>();
    }
    public String getDescricao() {
        return descricao;
    }
    public String getRegiao() {
        return regiao;
    }
    public void addProdutos(Produto produto){
        produtos.add(produto);
    }
    public void mostrarProdutos(){
        System.out.println("Lista de produtos: ");
        for (int x = 0; x < produtos.size(); x++){
            System.out.println(x + 1 + ". " + produtos.get(x).getDescricao());
        }
    }
    public double imposto(){
        double imposto = preco * 0.10;
        return imposto;
    }
    public double precofinales(){
        return 1;
    }
    public double precofinalna(){
        return 1;
    }
    public double precofinalin(){
        return 1;
    }
}