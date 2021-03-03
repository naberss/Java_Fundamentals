package Programas;
import java.util.Scanner;

public class horarios_jogo {

	public static void main(String[] args) {
		// O propósito deste programa é ler um horario de jogo
		// inicial e um final, e com base neles estipular o período de duração
		// do mesmo.
		// DECLARATION
		Scanner scan = new Scanner(System.in);
		double I, F, result;
		// BEGIN
		System.out.println("Digite o horário inicial do jogo: ");
		I = scan.nextDouble();
		System.out.println("Digite o horário final do jogo: ");
		F = scan.nextDouble();
		scan.close();
		// MAIN IF BEGIN
		if (I >= F) {
			result = 24 - (I - F);
			System.out.println("o jogo durou " + result + " horas");
		} else {
			result = (F - I);
			System.out.println("o jogo durou " + result + " horas");
		}
		// MAIN IF END
	}

}
