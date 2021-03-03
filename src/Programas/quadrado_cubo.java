package Programas;
import java.util.Scanner;

public class quadrado_cubo {

	public static void main(String[] args) {
		// DECLARATION
		int N;
		Scanner scan = new Scanner(System.in);
		// BEGIN

		System.out.println("Digite o numero a ser utilizado como referencia para a conta: ");
		N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println(N + " " + Math.pow(N, 2) + " " + Math.pow(N, 3));

		}
		scan.close();
	}

}
