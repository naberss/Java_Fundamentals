package Programas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_and_Buffered_Reader {

	public static void main(String[] args) {
		String path = "C:\\Users\\Lucas\\Documents\\MY_TXT.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Cria objeto para ler diretamente do arquivo texto em disco
			fr = new FileReader(path);
			// Cria objeto para armazenar em memoria por e instante de processamento, linha
			// especifica do arquivo texto a ser processada
			br = new BufferedReader(fr);

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
		} finally {
			
			// Fechamento do buffered reader e subtratamento de exeção na utilização do metodo close
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception f) {
				f.printStackTrace();

			}

			
			// Fechamento do file reader e subtratamento de exeção na utilização do metodo close
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception f) {
				f.printStackTrace();

			}
		}

	}

}
