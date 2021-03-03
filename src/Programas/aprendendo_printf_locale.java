package Programas;
import java.util.Locale;

public class aprendendo_printf_locale {

	public static void main(String[] args) {
		// DECLARATION
		String product1 = "Computer";
		String product2 = "Office desk";
//
		int age = 30;
		int code = 5290;
		char gender = 'F';
//
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;

		// BEGIN
		System.out.printf("Products:\n%s, in which preco is $ %.2f\n%s, which preco is $ %.2f\n\n"
				+ "Record: %d years old, code %d and gender: %s\n\n" + "Measure with eight decimal places: %.8f\n"
				+ "Rounded (three decimal places): %.3f\n"

				, product1, preco1, product2, preco2, age, code, gender, measure, measure

		);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
