public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

 
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
        if (quantidadeEstoque < 0) {
            this.quantidadeEstoque = 0;
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }

    public boolean verificarDisponibilidade() {
        return quantidadeEstoque > 0;
    }

    public static void main(String[] args) {
   
        Produto produto = new Produto("Camiseta", 29.90, 50);

        double valorTotalEmEstoque = produto.calcularValorTotalEmEstoque();

        boolean disponivel = produto.verificarDisponibilidade();

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
        System.out.println("Valor total em estoque: R$" + valorTotalEmEstoque);
        System.out.println("Disponível? " + (disponivel ? "Sim" : "Não"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            this.quantidadeEstoque = 0;
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
}
