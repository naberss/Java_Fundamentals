package Programas;

import java.util.Locale;
import java.util.Scanner;

import classes.Produto;

public class produto_estoque {

	public static void main(String[] args) {
		// Declaration
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String nome;
		double preco;
		int quantidade;
		// Begin

		Produto prod = new Produto();

		/*
		 * Um dos metodos contrutores criados, onde se faz necessario passar valores
		 * estaticos para os atributos na instanciaçao do objeto Produto prod = new
		 * Produto(nome, preco, quantidade);
		 */

		System.out.println("Digite o nome do produto");
		nome = scan.next();

		prod.setName(nome);

		System.out.println("Digite o valor inicial  do produto");
		preco = scan.nextDouble();

		prod.setPrice(preco);

		System.out.println("Digite a quantidade inicial do produto");
		quantidade = scan.nextInt();
		
		

		System.out.println(prod);
                                   
		
		
		
		
		System.out.println("Digite a quantidade do produto a ser adicionada: ");
		quantidade = scan.nextInt();
		prod.AdicionaProdutos(quantidade);
		System.out.println("Quantidade atualizada: " + prod.getName());

		System.out.println("Digite a quantidade do produto a ser removida: ");
		quantidade = scan.nextInt();
		prod.DeletaProdutos(quantidade);
		System.out.println("Quantidade atualizada: " + prod.getQuantity());

		System.out.println("Dados atualizados: " + prod);

		scan.close();
		// End
	}

}
