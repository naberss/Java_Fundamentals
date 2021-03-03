package Programas.Exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_section_8 {

	public static void main(String[] args) {
		// Declaration
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Exercicio_1_section_8_classe rec = new Exercicio_1_section_8_classe();
		// Begin
		do {

			System.out.println("Digite a largura do retangulo: ");
			rec.Width = scan.nextDouble();
			System.out.println("Digite a altura do retangulo: ");
			rec.Height = scan.nextDouble();

			if (rec.is_rectangle() == false) {
				System.out.println("As medidas digitadas nao correspondem a um triangulo");
			}

		} while (rec.is_rectangle() == false);
		scan.close();

		System.out.println("O valor da área do triângulo é de: " + rec.area());
		System.out.println("O valor da diagonal do triângulo é de: " + rec.diagonal());
		System.out.println("O valor do perímetro do triângulo é de: " + rec.perimeter());
		System.out.println(rec);

	}

}
