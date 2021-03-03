package Programas;
import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// O programa irá pedir 2 números e irá validar
		// se os mesmos são múltiplos.
		// DECLARATION
		Scanner scan = new Scanner(System.in);
		int a, b;

		// BEGIN
		System.out.println("Digite o valor do primeiro numero: ");
		a = scan.nextInt();
		System.out.println("Digite o valor do segundo numero: ");
		b = scan.nextInt();
		scan.close();
		if (a == 0 || b == 0) {
			System.out.println("Nenhum número é múltiplo de 0");
		} else {

			// SECOND IF STATEMENT BEGIN
			if (a >= b) {
				// THIRD IF STATEMENT BEGIN
				if (a % b == 0) {
					System.out.println(a + " e " + b + " são múltiplos");
				} else {
					System.out.println(a + " e " + b + " não são múltiplos");
				}
				// THIRD IF STATEMENT END

			} else {
				// THIRD IF STATEMENT BEGIN
				if (b % a == 0) {
					System.out.println(b + " e " + a + " são múltiplos");
				} else {
					System.out.println(b + " e " + a + " não são múltiplos");
				}
				// THIRD IF STATEMENT END

			}
			// SECOND IF STATEMENT END
		}
		// END
	}

}
