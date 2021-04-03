package Programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Pessoa;
import classes.Pessoa_Fisica;
import classes.Pessoa_Juridica;
import entidades.enums.pessoas_tipo;

public class Programa_Pessoas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		Integer vld_acao = null;

		do {

			System.out.println("1 - Cadastrar Pessoa \n" + "2 - Calcular Impostos \n" + "3 - Sair do Programa \n");
			vld_acao = scan.nextInt();

			switch (vld_acao) {

			case 1:
				registrarPessoa(pessoas);
				break;

			case 2:
				listarPessoa(pessoas);
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (vld_acao != 3);

		System.out.println("Obrigado pela preferência!!");

	}

	public static void registrarPessoa(List<Pessoa> list) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tipo de pessoa que será cadastrada (Pessoa Física - F / Pessoa Jurídica - J): ");
		String tipo = scan.next();
		while ((tipo.toUpperCase()).equals("F") == false && (tipo.toUpperCase()).equals("J") == false) {
			System.out.println("Opção inválida, favor reconsiderar conforme as  opções abaixo");
			System.out.print("Digite o tipo de pessoa que será cadastrada (Pessoa Física - F / Pessoa Jurídica - J): ");
			tipo = scan.next();
		}

		System.out.print("Digite o nome da pessoa: ");
		String nome = scan.next();

		System.out.print("Digite a renda anual: ");
		Double renda_anual = scan.nextDouble();

		pessoas_tipo pessoa_tipo = pessoas_tipo.valueOf(tipo.toUpperCase());

		if ((tipo.toUpperCase()).equals("F")) {
			System.out.print("Digite os gastos com saúde: ");
			Double gastos_saude = scan.nextDouble();

			Pessoa_Fisica pessoa_fisica = new Pessoa_Fisica(nome, renda_anual, gastos_saude, pessoa_tipo);
			list.add(pessoa_fisica);
		} else {
			System.out.print("Digite a quantidade de funcionários da empresa: ");
			int quantidade_funcionarios = scan.nextInt();

			Pessoa_Juridica pessoa_juridica = new Pessoa_Juridica(nome, renda_anual, quantidade_funcionarios,pessoa_tipo);
			list.add(pessoa_juridica);
		}

		System.out.println("Pessoa registrada!\n");

	}

	public static void listarPessoa(List<Pessoa> pessoas) {
		StringBuilder sb = new StringBuilder();
		sb.append("TAXES PAID:\n");
		for (Pessoa pessoa : pessoas) {
			sb.append(pessoa.getNome() + ": ");
			if (pessoa instanceof Pessoa_Fisica) {
				sb.append("$ " + ((Pessoa_Fisica) pessoa).calcula_imposto() + "\n");
			} else {
				sb.append("$ " + ((Pessoa_Juridica) pessoa).calcula_imposto() + "\n");
			}
		}
		System.out.println(sb);

	}

}
