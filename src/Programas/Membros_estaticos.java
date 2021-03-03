package Programas;

import java.util.Locale;
import java.util.Scanner;

import classes.Membros_estaticos_class;

public class Membros_estaticos {

	public static void main(String[] args) {
		// Declaration
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double radius, c, v;

		// Begin

		System.out.println("Enter radius: ");
		radius = scan.nextDouble();
		scan.close();
		c = Membros_estaticos_class.circumference(radius);
		v = Membros_estaticos_class.volume(radius);

		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi value: %.2f\n", Membros_estaticos_class.pi);
		// End

	}

}
