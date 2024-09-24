import java.time.LocalDate; //Iportando a classe para trabalhar com datas

public class Produto {

    //Variaveis
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    
    
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }


    //Contrutor pedindo os parametros
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }



    //Sobrecarga do construtor com menos parametros
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1); 
    }



    //Sobrecarga do construtor com apenas dois parametros
    public Produto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto*1.10;
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = this.dataFabricacao.now().plusMonths(1);
    }

     // Método status
     public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço de Custo: " + this.getPrecoCusto());
        System.out.println("Preço de Venda: " + this.getPrecoVenda());
        System.out.println("Data de Fabricação: " + this.getDataFabricacao());
        System.out.println("Data de Validade: " + this.getDataValidade());
    }

}
