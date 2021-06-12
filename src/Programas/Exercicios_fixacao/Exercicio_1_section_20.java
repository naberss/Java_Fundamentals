package Programas.Exercicios_fixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio_1_section_20 {

	public static void main(String[] args) {

		try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Lucas\\Documents\\MY_TXT.txt"))) {

			List<Exercicio_1_section_20_classe> myList = new ArrayList<>();

			String line = bf.readLine();

			while (line != null) {

				String[] lineAux = line.split(",");
				String name = lineAux[0];
				Double preco = Double.parseDouble(lineAux[1]);

				myList.add(new Exercicio_1_section_20_classe(name, preco));

				line = bf.readLine();

			}
			System.out.println("Fim da leitura do arquivo! ");

			Double medio = myList.stream().map(x -> x.getPreco()).reduce(0.0, Double::sum);

			medio = medio / myList.size();

			final Double medioAux = medio;

			System.out.println("Preço médio: " + medio);

			List<Exercicio_1_section_20_classe> myListaux = myList.stream().filter(x -> x.getPreco() < medioAux)
					.collect(Collectors.toList());

			Collections.sort(myListaux);

			for (Exercicio_1_section_20_classe rec : myListaux) {
				System.out.println("Nome: " + rec.getName() + " / Preço: " + rec.getPreco());
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
