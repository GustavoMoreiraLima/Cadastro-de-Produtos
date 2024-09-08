import java.util.ArrayList;

public class Lista{
    ArrayList<Produto> produtos;
    public Lista(){
        produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void mostrarProdutos(int tipo){
        switch(tipo){
            case 1:
                System.out.println("Lista de produtos ESTADUAIS: ");
                for (int x = 0; x < produtos.size(); x++){
                    if ("Estadual" == produtos.get(x).getRegiao()){
                        System.out.println(x + 1 + ". " + produtos.get(x).getDescricao() + " R$" + produtos.get(x).precofinales());
                    }
                }
                break;
            case 2:
                System.out.println("Lista de produtos NACIONAIS: ");
                for (int x = 0; x < produtos.size(); x++){
                    if ("Nacional" == produtos.get(x).getRegiao()){
                        System.out.println(x + 1 + ". " + produtos.get(x).getDescricao() + " R$" + produtos.get(x).precofinalna());
                    }
                }
                break;
            case 3:
                System.out.println("Lista de produtos INTERNACIONAIS: ");
                for (int x = 0; x < produtos.size(); x++){
                    if ("Internacional" == produtos.get(x).getRegiao()){
                        System.out.println(x + 1 + ". " + produtos.get(x).getDescricao() + " R$" + produtos.get(x).precofinalin());
                    }
                }
                break;
            case 4:
                System.out.println("Lista de todos os produtos: ");
                for (int x = 0; x < produtos.size(); x++){
                    if ("Estadual" == produtos.get(x).getRegiao()){
                        System.out.println(x + 1 + ". " + produtos.get(x).getDescricao() + " R$" + produtos.get(x).precofinales());
                    }
                }
                for (int i = 0; i < produtos.size(); i++){
                    if ("Nacional" == produtos.get(i).getRegiao()){
                        System.out.println(i + 1 + ". " + produtos.get(i).getDescricao() + " R$" + produtos.get(i).precofinalna());
                    }
                }
                for (int j = 0; j < produtos.size(); j++){
                    if ("Internacional" == produtos.get(j).getRegiao()){
                        System.out.println(j + 1 + ". " + produtos.get(j).getDescricao() + " R$" + produtos.get(j).precofinalin());
                    }
                }
                    break;
                }
            }
        }

