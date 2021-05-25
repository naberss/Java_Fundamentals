package Programas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_and_Buffered_Writer {

	public static void main(String[] args) {
		String path = "C:\\Users\\Lucas\\Documents\\MY_TXT_2.txt";
		String my_vet[] = new String[] { "pera", "banana", "maça" };
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));) {

			
			for(String line: my_vet) {
				bw.write(line);
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
