package estruturas_dados;

import java.util.Scanner;

public class Lista_1_exercicio4 {

	public static void main(String[] args) {

		Lista_1_exercicio4_classe ed[] = new Lista_1_exercicio4_classe[3];

		input_student(ed);
		Print_higher_scores(ed);

	}

	public static void input_student(Lista_1_exercicio4_classe ed[]) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < ed.length; i++) {

			System.out.println("Digite o nome do aluno: ");
			String nome = scan.next();

			System.out.println("\nDigite a quantidade de faltas do aluno: ");
			Integer faltas = scan.nextInt();

			System.out.println("\nDigite a media do aluno: ");
			Double media = scan.nextDouble();

			ed[i] = new Lista_1_exercicio4_classe(nome, faltas, media);

			if (ed[i].getFaltas() > 20) {
				System.out.println(nome + " está reprovado por faltas \n ");

			} else if (ed[i].getMedia() < 5) {
				System.out.println(nome + " está reprovado por nota insuficiente \n ");
			} else {
				System.out.println(nome + " está aprovado \n ");
			}
		}

		scan.close();

	}

	public static void Print_higher_scores(Lista_1_exercicio4_classe ed[]) {

		double aux = -1;
		for (int i = 0; i < ed.length; i++) {

			if (ed[i].getMedia() > aux) {
				aux = ed[i].getMedia();
			}

		}

		for (int i = 0; i < ed.length; i++) {

			if (ed[i].getMedia() == aux) {
				System.out.println(ed[i].toString() + "n possui uma das maiores medias");

			}

		}

	}
}
