package Programas.Exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_section_8 {

	public static void main(String[] args) {
		// Declaration
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Exercicio_2_section_8_classe func = new Exercicio_2_section_8_classe();
		double pct;

		// Begin
		System.out.println("Digite o nome do funcionário: ");
		func.name = scan.next();
		
		System.out.println("Digite o salário bruto do funcionário: ");
		func.gross_salary = scan.nextDouble();
		
		System.out.println("Digite o valor das taxas aplicadas ao salário do funcionário: ");
		func.tax = scan.nextDouble();

		System.out.println(func);

		System.out.println("Digite o valor da % de aumento que o funcionário irá receber: ");
		pct = scan.nextDouble();
		
		scan.close();
		
		func.IncreaseSalary(pct);
		
		System.out.println(func);
		// End

	}

}
