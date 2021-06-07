package Programas.Exercicios_fixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exercicio_3_section_19 {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lucas\\Documents\\MY_TXT_2.txt"))) {

			String line = br.readLine();

			while (line != null) {
				String lineAux[] = line.split(",");

				if (myMap.containsKey(lineAux[0])) {
					Integer myValue = myMap.get(lineAux[0]).intValue();
					myMap.replace(lineAux[0], myValue + Integer.parseInt(lineAux[1]));

				} else {
					myMap.put(lineAux[0], Integer.parseInt(lineAux[1]));
				}

				line = br.readLine();

			}

			for (String rec : myMap.keySet()) {
				System.out.println("Nome: " + rec + " / Quantidade de Votos: " + myMap.get(rec));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
