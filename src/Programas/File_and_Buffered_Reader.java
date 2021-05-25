package Programas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_and_Buffered_Reader {

	public static void main(String[] args) {
		String path = "C:\\Users\\Lucas\\Documents\\MY_TXT.txt";

		
		    //cria BufferedReader e instancia o FileReader na mesma linha, usando try-with-resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Cria objeto para ler diretamente do arquivo texto em disco

			// Desaloca a linha atual da memória e pega a proxima
			String line = br.readLine();

			// Checa se o arquivo ainda esta preenchido antes de ler a proxima linha e pinta
			// o conteudo em tela
			while (line != null) {
				System.out.println(line);

				// Pula a linha e lê a proxima linha do arquivo, após quebra de linha
				line = br.readLine();

			}
		}

		catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}

}
