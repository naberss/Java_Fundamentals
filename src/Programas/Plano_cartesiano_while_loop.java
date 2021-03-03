package Programas;
import java.util.Scanner;

public class Plano_cartesiano_while_loop {

	public static void main(String[] args) {
		// DECLARATION
		Integer X, Y;
		Scanner scan = new Scanner(System.in);
		// BEGIN
		System.out.println("Digite o valor da variável X: ");
		X = scan.nextInt();
		System.out.println("Digite o valor da variável Y: ");
		Y = scan.nextInt();
		// BEGIN WHILE STATEMENT
		while (X != 0 && Y != 0) {

			// BEGIN 1º IF (1º QUAD.)
			if (X > 0 && Y > 0) {
				System.out.println("As variáveis apontam para o 1º quadrante");
			}
			// END 1º IF

			else
			// BEGIN 2º IF (2º QUAD.)
			if (X < 0 && Y > 0) {
				System.out.println("As variáveis apontam para o 2º quadrante");
			}
			// END 2º IF

			else
			// BEGIN 3º IF (3º QUAD.)
			if (X < 0 && Y < 0) {
				System.out.println("As variáveis apontam para o 3º quadrante");
			}
			// END 3º IF

			else
			// BEGIN 4º IF (4º QUAD.)
			if (X > 0 && Y < 0) {
				System.out.println("As variáveis apontam para o 4º quadrante");
			}
			// END 4º IF

			else
			// BEGIN 5º IF (SOBRE A LINHA)
			if (X == 0 || Y == 0) {
				System.out
						.println("A localização vigente está sobre o traçado,\nnão se enquadrando em nenhum quadrante");
			}
			// END 5º IF

			// BEGIN VARIABLES INSERTION SO THEY CAN LOOP WITH NEW VALUES
			System.out.println("\nDigite o valor da variável X: ");
			X = scan.nextInt();
			System.out.println("\nDigite o valor da variável Y: ");
			Y = scan.nextInt();
			// BEGIN VARIABLES INSERTION SO THEY CAN LOOP WITH NEW VALUES

		}
		scan.close();
		// END WHILE STATEMENT
		// END
	}

}
