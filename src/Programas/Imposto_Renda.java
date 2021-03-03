package Programas;
import java.util.Locale;
import java.util.Scanner;

public class Imposto_Renda {

	public static void main(String[] args) {
		// O programa irá calcular o valor do imposto de
		// renda de cidadãos conforme seus ganhos mensais e de
		// acordo com as regras definidas pelo exercício.
		// DECLARATION
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double salario, valor_aux = 0, valor_final = 0, IR;

		// BEGIN
		System.out.println("Digite o valor do salário: ");
		salario = scan.nextDouble();
		scan.close();
		// DEFINING TAXES EXEMPTION BEGIN
		// TOTAL EXEMPTION BEGIN
		if ((2000 - salario) > 0) { 
			System.out.println(salario + " rombus foram isentos de imposto de renda");
			salario -= 2000;

		} else {
			salario = salario - 2000;
			System.out.println(2000 + " rombus foram isentos de imposto de renda");
		}
		// TOTAL EXEMPTION END
		// 8% BEGIN
		if (salario > 0) {
			IR = 0.08;
			if (((3000 - 2000.01) - salario) > 0) {
				valor_aux = ((salario) * IR);
				System.out.println(IR * 100 + "% sobre " + salario + " resultando no valor " + valor_aux);
			} else {
				valor_aux = (3000 - 2000.01) * IR;
				System.out.println(IR * 100 + "% sobre " + (3000 - 2000.01) + " resultando no valor " + valor_aux);

			}
			salario = salario - (3000 - 2000.01);
			valor_final += (valor_aux);
		}
		// 8% END;

		// 18% BEGIN
		if (salario > 0) {
			IR = 0.18;
			if (((4500 - 3000.01) - salario) > 0) {
				valor_aux = ((salario) * IR);
				System.out.println(IR * 100 + "% sobre " + salario + " resultando no valor " + valor_aux);

			} else {
				valor_aux = (4500 - 3000.01) * IR;
				System.out.println(IR * 100 + "% sobre " + (3000 - 2000.01) + " resultando no valor " + valor_aux);

			}
			salario = salario - (4500 - 3000.01);
			valor_final += (valor_aux);
		}
		// 18% END;

		// 28% BEGIN
		if (salario > 0) {
			IR = 0.28;
			valor_aux = salario * IR;
			valor_final += (valor_aux);
			System.out.println(IR * 100 + "% sobre " + salario + " resultando no valor " + valor_aux);
		}
		// 28% END;

		System.out.println("O total pago em IR é de " + valor_final);

	}

}
