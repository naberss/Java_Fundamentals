package Programas.Exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3_section_8 {

	public static void main(String[] args) {
		// Declaration
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Exercicio_3_section_8_classe alun = new Exercicio_3_section_8_classe();

		System.out.println("Digite o nome do aluno: ");
		alun.name = scan.next();

		for (int i = 0; i < alun.notas.length; i++) {
			System.out.println("Digite a nota do " + (i+1) + "º trimestre: ");
			alun.notas[i] = scan.nextDouble();
		}

		scan.close();

		System.out.println(alun);

		System.out.println(
				"the student " + alun.pass_failed(alun.calcula_total()) + " with an score of " + alun.calcula_total());

	}

}
