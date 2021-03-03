package Programas;

import java.util.Locale;
import java.util.Scanner;

import classes.Currency_converter_class;

public class Currency_converter {

	public static void main(String[] args) {
		// Declaration
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double valor, cotacao;

		// Begin

		System.out.println("Digite o valor da cotação: ");
		cotacao = scan.nextDouble();

		System.out.println("Digite o valor a ser convertido: ");
		valor = scan.nextDouble();
		scan.close();

		System.out.println("o valor a ser pago em reais será de " + Currency_converter_class.convert(cotacao, valor));

	}

}
