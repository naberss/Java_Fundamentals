package Programas.Exercicios_fixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio_2_section_20 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lucas\\Documents\\MY_TXT.txt"));
				Scanner scan = new Scanner(System.in)) {

			List<Exercicio_2_section_20_classe> myList = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {

				String[] mySplit = line.split(",");

				String name = mySplit[0];
				String email = mySplit[1];
				Double salario = Double.parseDouble(mySplit[2]);

				myList.add(new Exercicio_2_section_20_classe(name, email, salario));

				line = br.readLine();

			}

			System.out.println("Digite um valor de salario: ");
			Double salario = scan.nextDouble();

			List<String> myListEmails = myList.stream().filter(x -> x.getSalario() > salario).map(x -> x.getEmail())
					.sorted().collect(Collectors.toList());

			for (String rec : myListEmails) {
				System.out.println(rec);
			}

			Double soma = myList.stream().filter(x -> x.nome.charAt(0) == 'M' || x.nome.charAt(0) == 'm')
					.map(x -> x.getSalario()).reduce(0.0, Double::sum);

			System.out.println("Soma dos salarios dos empregados cujo nome começa com a letra M: $" + soma);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
