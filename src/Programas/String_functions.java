package Programas;

public class String_functions {

	public static void main(String[] args) {

		String teste = "testexyz ";
		String teste_substring;
		String teste_toUpperCase;
		String teste_toLowerCase;
		String teste_trim;
		int teste_indexOf;
		int teste_lastIndexOf;
		String teste_replace;
		String[] teste_split = teste.split("e");

		teste_substring = teste.substring(0,5);
		teste_toUpperCase = teste.toUpperCase();
		teste_toLowerCase = teste.toLowerCase();
		teste_trim = teste.trim();
		teste_indexOf = teste.indexOf("yz");
		teste_lastIndexOf = teste.lastIndexOf("e");
		teste_replace = teste.replace("yz", "pera");

		System.out.println("teste: " + teste);
		System.out.println("teste_substring: " + teste_substring);
		System.out.println("teste_toUpperCase: " + teste_toUpperCase);
		System.out.println("teste_toLowerCase: " + teste_toLowerCase);
		System.out.println("teste_trim: " + teste_trim);
		System.out.println("teste_indexOf: " + teste_indexOf);
		System.out.println("teste_lastIndexOf: " + teste_lastIndexOf);
		System.out.println("teste_replace: " + teste_replace);

		for (int i = 0; i < teste_split.length; i++) {
			System.out.println("teste_split(" + i + "): " + teste_split[i]);

		}

	}

}
