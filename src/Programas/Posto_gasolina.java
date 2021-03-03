package Programas;
import java.util.Scanner;

public class Posto_gasolina {

	public static void main(String[] args) {
		// DECLARATION
		int x = 0, qtd_alcool = 0, qtd_gasolina = 0, qtd_diesel = 0;
		Scanner scan = new Scanner(System.in);
		// BEGIN

		// BEGIN LOOP
		while (x != 4) {
			// BEGIN SWITCHING (X)
			System.out.println("Digite 1 para alcool\n" + "Digite 2 para gasolina\n" + "Digite 3 para diesel\n"
					+ "Digite 4 para dispensar o programa\n");
			x = scan.nextInt();
			switch (x) {
			// ADD ALCOOL
			case 1:
				qtd_alcool += 1;
				break;
			// ADD GASOLINA
			case 2:
				qtd_gasolina += 1;
				break;
			// ADD DIESEL
			case 3:
				qtd_diesel += 1;
				break;
			// NO FILL
			default:
				System.out.println("Esta opção não está entre as disponíveis, favor redigite alguma que esteja!");

			}
			// END SWITCHING (X)

		}
		// END LOOP
		scan.close();
		System.out.println("A quantidade de clientes que optou por alcool foi de " + qtd_alcool + "\n"
				+ "A quantidade de clientes que optou por gasolina foi de " + qtd_gasolina + "\n"
				+ "A quantidade de clientes que optou por diesel foi de " + qtd_diesel + "\n" + "Fim do programa :)");

	}

}
