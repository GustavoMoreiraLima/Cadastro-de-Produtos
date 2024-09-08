import java.util.Scanner;

public class Menu {
    public Menu() {
        int opcao = 0;
        String descricao;
        double valor;
        Scanner leia = new Scanner(System.in);
        Lista listaes = new Lista();
        do {
            System.out.println("-----MENU-----\n1.Cadastrar Produto Estadual\n2.Cadastrar Produto Nacional\n3.Cadastrar Produto Importado\n4.Exibir Produtos Estaduais\n5.Exibir Produtos Nacionais\n6.Exibir Produtos Importados\n7.Exibir Todos Produtos\n8.SAIR");
            opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual o nome do produto? ");
                    descricao = leia.next();
                    System.out.println("Qual o valor do produto? ");
                    valor = leia.nextDouble();
                    Estadual produto = new Estadual(descricao, valor, "Estadual");
                    listaes.adicionarProduto(produto);
                    break;
                case 2:
                    System.out.println("Qual o nome do produto? ");
                    descricao = leia.next();
                    System.out.println("Qual o valor do produto? ");
                    valor = leia.nextDouble();
                    Nacional produtoNacional = new Nacional(descricao, valor, "Nacional");
                    listaes.adicionarProduto(produtoNacional);
                    break;
                case 3:
                    System.out.println("Qual o nome do produto? ");
                    descricao = leia.next();
                    System.out.println("Qual o valor do produto? ");
                    valor = leia.nextDouble();
                    Internacional produtoImportado = new Internacional(descricao, valor, "Internacional");
                    listaes.adicionarProduto(produtoImportado);
                    break;
                case 4:
                    listaes.mostrarProdutos(1);
                    break;
                case 5:
                    listaes.mostrarProdutos(2);
                    break;
                case 6:
                    listaes.mostrarProdutos(3);
                    break;
                case 7:
                    listaes.mostrarProdutos(4);
                    break;
                case 8:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Selecione uma opção válida.");
            }
        } while (opcao != 8);
    }
}