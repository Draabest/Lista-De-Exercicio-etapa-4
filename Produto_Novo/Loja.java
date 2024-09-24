import java.time.LocalDate;
import java.util.Scanner; // importando um Scanner

public class Loja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // criando o objeto Scanner
        
        // Faz o usuario preencher apenas especificaçoes que ele tem
        System.out.println("Quais sao as especificaçoes do produto:");
        System.out.println("1. Nome, Preço de Custo, Preço de Venda, Data de Fabricação, Data de Validade");
        System.out.println("2. Nome, Preço de Custo, Preço de Venda, Data de Fabricação");
        System.out.println("3. Nome, Preço de Custo");
        int escolha = scan.nextInt();
        scan.nextLine(); // Consumir a nova linha

        Produto produto = null; //Utilizado no objeto produto nos cases

        //Especificaçoes
        switch (escolha) {
            case 1:


                System.out.print("Digite o nome do produto: ");
                String nome1 = scan.nextLine();
                System.out.print("Digite o preço de custo: ");
                double precoCusto1 = scan.nextDouble();
                System.out.print("Digite o preço de venda: ");
                double precoVenda1 = scan.nextDouble();
                scan.nextLine(); // Consumir a nova linha
                System.out.print("Digite a data de fabricação (yyyy-MM-dd): ");
                String dataFabricacaoStr1 = scan.nextLine();
                LocalDate dataFabricacao1 = LocalDate.parse(dataFabricacaoStr1);
                System.out.print("Digite a data de validade (yyyy-MM-dd): ");
                String dataValidadeStr1 = scan.nextLine();
                LocalDate dataValidade1 = LocalDate.parse(dataValidadeStr1);
                produto = new Produto(nome1, precoCusto1, precoVenda1, dataFabricacao1, dataValidade1);
                    break;


                case 2:


                    System.out.print("Digite o nome do produto: ");
                    String nome2 = scan.nextLine();
                    System.out.print("Digite o preço de custo: ");
                    double precoCusto2 = scan.nextDouble();
                    System.out.print("Digite o preço de venda: ");
                    double precoVenda2 = scan.nextDouble();
                    scan.nextLine(); // Consumir a nova linha
                    System.out.print("Digite a data de fabricação (yyyy-MM-dd): ");
                    String dataFabricacaoStr2 = scan.nextLine();
                    LocalDate dataFabricacao2 = LocalDate.parse(dataFabricacaoStr2);
                    produto = new Produto(nome2, precoCusto2, precoVenda2, dataFabricacao2);
                    break;


                case 3:


                    System.out.print("Digite o nome do produto: ");
                    String nome3 = scan.nextLine();
                    System.out.print("Digite o preço de custo: ");
                    double precoCusto3 = scan.nextDouble();
                    produto = new Produto(nome3, precoCusto3);
                    break;


                default:

                    System.out.println("Opção inválida.");

                    break;

            }

            //Verificaçao se o produto foi corretamente atribuido
            if (produto != null) {
                produto.status();
            }

    
        scan.close();
    }

}
