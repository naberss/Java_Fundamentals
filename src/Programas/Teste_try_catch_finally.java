package Programas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teste_try_catch_finally {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Lucas\\Desktop\\pera_mamao_banana.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());

		} finally {
			if (scan != null) {
				scan.close();

			}
			System.out.println("Finally block executed");

		}

	}

}
