package Programas.Exercicios_fixacao;

import java.util.Scanner;

public class Exercicio_3_section_10 {

	public static void main(String[] args) {
		// DECLARE
		Scanner scan = new Scanner(System.in);

		// BEGIN

		Integer z;

		System.out.println("Digite o número de linhas presentes na matriz: ");
		Integer x = scan.nextInt();

		System.out.println("Digite o número de colunas presentes na matriz: ");
		Integer y = scan.nextInt();

		Integer mat[][] = new Integer[x][y];

		System.out.println("Tamanho configurado ! \n");

		do {

			System.out.println("\n Bem vindo ao programinha, por favor digite a opção desejada conforme sua operação \n"
					+ "1 - Preencher a matriz com dados\n" + "2 - Achar um número e mostrar as casas vizinhas\n"
					+ "3 -Sair do programa\n ");

			z = scan.nextInt();

			switch (z) {

			case 1:
				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat[i].length; j++) {
						System.out.println("Digite o número que irá pertencer a linha " + i + " coluna " + j + "\n");
						mat[i][j] = scan.nextInt();
					}
				}
				System.out.println("Valores configurados ! \n");
				break;

			case 2:
				System.out.println("Digite o número a ser pesquisado: \n");
				x = null;
				x = scan.nextInt();
				y = find_number(mat, x);
				if (y == 1) {
					System.out.println("O número digitado esta presente na matriz \n");
					operation(mat, x);
				} else {
					System.out.println("O número digitado não foi encontrado na matriz, favor tentar novamente \n");
				}
				break;

			case 3:

				System.out.println("Obrigado por usar o programa ! até a próxima \n");

				break;

			default:
				System.out.println("Esta opção não está disponível, tente denovo de acordo com o menu, obg \n");

			}

		} while (z != 3);

		scan.close();

	}

	// metodo ira efetuar as operações
	// direita = coluna +1
	// esquerda = coluna -1
	// baixo = linha +1
	// cima = linha -1
	// identificar se a posição ao lado existe ao validar uma info
	static void operation(Integer[][] mat, Integer find) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == find) {
					// cima
					if (i - 1 < 0) {
						System.out.println("não existe coluna acima deste para printar valor");
					} else {
						System.out.println("Cima: " + mat[i - 1][j]);
					}

					// baixo
					if (i + 1 > mat.length) {
						System.out.println("não existe coluna abaixo deste para printar valor");
					} else {
						System.out.println("Baixo: " + mat[i + 1][j]);
					}

					// direita
					if (j + 1 > mat[i].length) {
						System.out.println("não existe coluna a direita deste para printar valor");
					} else {
						System.out.println("Direita: " + mat[i][j + 1]);
					}

					// esquerda
					if (j - 1 < 0) {
						System.out.println("não existe coluna a esquerda deste para printar valor");
					} else {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
				}
			}
		}
	}

	// metodo ira validar a ocorrencia para decidir se efetua as operações
	static Integer find_number(Integer[][] mat, Integer x) {
		Integer z = null;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					z = 1;
				}
			}
		}
		return z;
	}

}
