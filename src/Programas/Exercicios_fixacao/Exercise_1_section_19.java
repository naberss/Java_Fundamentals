package Programas.Exercicios_fixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_1_section_19 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lucas\\Documents\\MY_TXT.txt"))) {

			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ssZ");
			Set<Exercise_1_section_19_classe> mySet = new HashSet<>();

			String[] line = br.readLine().split(" ");

			while (line != null) {
				mySet.add(new Exercise_1_section_19_classe(line[0], Date.from(Instant.parse(line[1]))));

				String lineAux = br.readLine();

				if (lineAux != null) {
					line = lineAux.split(" ");
				} else {
					line = null;
				}

			}

			System.out.println("Tamanho da collection: " + mySet.size());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
