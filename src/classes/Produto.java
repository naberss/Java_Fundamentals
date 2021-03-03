package classes;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
	}

	// Functional methods
	public double ValorTotalEstoque() {
		return (this.preco * this.quantidade);
	}

	public void AdicionaProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void DeletaProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	// Generic methods

	public String toString() {
		return this.nome + ", " + "$ " + this.preco + ", " + this.quantidade + ", Total $ "
				+ String.format("%.2f", ValorTotalEstoque());
	}

	public String getName() {
		return this.nome;
	}

	public double getPrice() {
		return this.preco;
	}

	public int getQuantity() {
		return this.quantidade;
	}

	public void setName(String name) {
		this.nome = name;

	}

	public void setPrice(double price) {
		this.preco = price;

	}
}
