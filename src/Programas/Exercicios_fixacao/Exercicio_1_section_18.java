package Programas.Exercicios_fixacao;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import classes.Contract;
import services.ContractService;
import services.PaypalService;

public class Exercicio_1_section_18 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int menu;
		Contract contract = null;
		try (Scanner scan = new Scanner(System.in)) {

			do {

				System.out.println("Bem vindo ao gerenciador de titulos escolha a opção baseada na sua necessidade:\n"
						+ "1 - Cadastrar Contrato\n" + "2 - Cadastrar Parcelas\n" + "3 - Sair do programa\n");

				menu = scan.nextInt();

				switch (menu) {
				case 1:
					try {
						System.out.println("Digite a data de emissão do contrato: ");
						String myDate = scan.next();

						System.out.println("Digite o número do contrato: ");
						int myNumber = scan.nextInt();

						System.out.println("Digite o valor do contrato: ");
						double myTtotalValue = scan.nextDouble();

						contract = new Contract(myNumber, sdf.parse(myDate), myTtotalValue);
					} catch (Exception e) {
						e.printStackTrace();
					}
					 break; 

				case 2:
					ContractService CS = new ContractService();
					System.out.println("Digite a quantidade de parcelas para este contrato: ");
					int noInstallments = scan.nextInt();
					CS.processContract(contract, noInstallments, new PaypalService());
					System.out.println(contract.toString());
					break;

				}

			} while (menu != 3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
