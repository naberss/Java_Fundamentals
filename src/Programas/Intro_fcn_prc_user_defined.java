package Programas;
import java.util.Scanner;

public class Intro_fcn_prc_user_defined {

	public static void main(String[] args) {
		// DECLARATION
		Scanner scan = new Scanner(System.in);
		int A, B, C;
		// BEGIN
		System.out.println("Digite o valor de A que será comparado: ");
		A = scan.nextInt();
		System.out.println("Digite o valor de B que será comparado: ");
		B = scan.nextInt();
		System.out.println("Digite o valor de C que será comparado: ");
		C = scan.nextInt();
		ShowResult(Max(A, B, C));
		scan.close();
		// END

	}

	public static String[] Max(int a, int b, int c) {

		int aux;
		String[] x = new String[3];
		// checa se x é o maior
		if (a > b && a > c) {
			aux = a;
			// checa se y é o maior
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}

		// inputa aux e valores repetidos no array
		if (aux == a) {
			x[0] = "A" + a;
		}
		if (aux == b) {
			x[1] = "B" + b;
		}
		if (aux == c) {
			x[2] = "C" + c;
		}

		return x;
	}

	public static void ShowResult(String[] a) {
		int count = 0;
		String exibir = "";
		// Formatando a mensagem a ser exibida com base no tamanho do vetor
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				count++;
				exibir += " e " + a[i].substring(0, 1) + " = " + a[i].substring(1);
			}
		}
		// Decidindo que tipo de mensagem será exibida (plural /singular)
		if (count > 1) {
			System.out.println("O maiores valores são " + exibir.substring(2));
		} else {
			System.out.println("O maior valor é de" + exibir.substring(2));
		}

	}

}
