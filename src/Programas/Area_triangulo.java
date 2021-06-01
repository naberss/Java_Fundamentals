package Programas;
import java.util.Locale;
import java.util.Scanner;

import classes.Triangulo;

public class Area_triangulo {

	public static void main(String[] args) {
		// Declaration
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		// Begin
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		scan.close();
		System.out.printf("A área do triângulo X é de %.4f%n", x.area());
		System.out.printf("A área do triângulo y é de %.4f%n", y.area());
		// End
		
		

	}

}
