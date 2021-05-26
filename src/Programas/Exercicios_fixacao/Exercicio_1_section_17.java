package Programas.Exercicios_fixacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import classes.Item;

public class Exercicio_1_section_17 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Lucas\\Documents\\Origin.csv");
		boolean newPath = new File("C:\\Users\\Lucas\\Documents\\out").mkdir();
		File newFile = new File("C:\\Users\\Lucas\\Documents\\out\\Destiny.csv");
		String line[] = new String[3];
		String lineAux;

		try (BufferedReader br = new BufferedReader(new FileReader(file));
				BufferedWriter fw = new BufferedWriter(new FileWriter(newFile));) {
			lineAux = br.readLine();
			while (lineAux != null) {
				line = lineAux.split(",");
				Item item = new Item(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2]));

				fw.write(item.toString());
				fw.newLine();

				lineAux = br.readLine();
			}

			System.out.println("Completed!");

		} catch (IOException e) {
			System.out.println("Error message: " + e.getMessage() + "\n" + "Stack Trace: " + e.getStackTrace());
		}

	}

}
