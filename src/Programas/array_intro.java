package Programas;

import java.util.Locale;
import java.util.Scanner;

import classes.Produto;

public class array_intro {

	public static void main(String[] args) {
		// Declare
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double avg = 0;
		// Begin
		System.out.println("Digite a quantidade de produtos a ser alocada no array: ");
		int n = scan.nextInt();
		Produto prod[] = new Produto[n];
		for (int i = 0; i < prod.length; i++) {
			String nome;
			double preco;
			System.out.println("Digite o nome do "+(i+1)+"º produto a ser alocado no array: ");
			nome = scan.next();
			System.out.println("Digite o preço do "+(i+1)+"º produto a ser alocado no array: ");
			preco = scan.nextDouble();
			prod[i] = new Produto(nome, preco);
			avg += prod[i].getPrice();

		}
		scan.close();

		avg = (avg / prod.length);

		System.out.println("A média dos " + prod.length + " produtos é de " + avg);
	}

}
