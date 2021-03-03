package Programas.Exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_section_9 {

	public static void main(String[] args) {
		// Declaration
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String name;
		double value;
		int x=0;

		// Begin

		System.out.println("Bem vindo ao sistema do banco, para que possamos criar sua conta preciso que me diga alguns dados, vamos começar? \n"
						 + "Pois bem, primeiramente me diga o seu nome: ");
		name = scan.next();

		System.out.println("\nMuito bom, agora me diga um valor caso você queira deposita-lo nesta conta: ");
		value = scan.nextDouble();

		Exercicio_1_section_9_classe acc = new Exercicio_1_section_9_classe(01, name);

		if (value != 0) {
			acc.cash_in(value);
		}
		;

		System.out.println(acc);

		while (x != 5) {

			System.out.println("\nBem vindo ao menu da aplicação bancária, seguem abaixo as opções disponíveis -> \n"
							 + "1 - Exibir informações da conta \n" 
							 + "2 - Alterar o nome do proprietário \n"
							 + "3 - Depositar \n" 
							 + "4 - Sacar \n" 
							 + "5 - Sair da aplicação \n");
			
			x = scan.nextInt();

			switch (x) {

			case 1:
				System.out.println(acc);
				break;

			case 2:
				System.out.println("Digite o novo nome do proprietário: ");
				name = scan.next();
				acc.setname(name);
				break;

			case 3:

				System.out.println("Digite o quanto você deseja depositar: ");
				value = scan.nextDouble();
				acc.cash_in(value);
				break;

			case 4:
				System.out.println("\nlembrando que será cobrada uma taxa de 5 reais por operação deste tipo \n"
						         + "Digite o quanto você deseja sacar: ");
				value = scan.nextDouble();
				acc.cash_out(value);
				break;
				
			case 5:
				System.out.println("\nObrigado pela preferência");

			default:
				System.out.println("Esta operação nao existe, favor se atentar ao menu");

			};
		}
		scan.close();

	}

}
