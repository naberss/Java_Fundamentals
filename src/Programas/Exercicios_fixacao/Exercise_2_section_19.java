package Programas.Exercicios_fixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise_2_section_19 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);) {
			int vld;
			int idGlobal = 0;
			Set<Exercise_2_section_19_instrutor> instrutores = new HashSet<>();
			Set<Exercise_2_section_19_curso> cursos = new HashSet<>();

			do {
				System.out.println("1 - Inserir Curso\n" + "2 - Total de alunos\n");

				vld = scan.nextInt();
				switch (vld) {
				case 1:
					insereCurso(idGlobal, cursos, instrutores);
					break;

				case 2:
					quantAlunos(instrutores);
					break;

				}

			} while (vld != 3);

		}

	}

	public static void insereCurso(int idGlobal, Set<Exercise_2_section_19_curso> cursos,
			Set<Exercise_2_section_19_instrutor> instrutores) {

		Scanner scan = new Scanner(System.in);
		String Cursoname;
		Character xvld = null;
		Exercise_2_section_19_instrutor instrutor = null;

		System.out.println("Insira o nome do curso: ");
		Cursoname = scan.next();

		/* CADASTRA / SELECIONA INSTRUTOR */

		while (xvld == null) {

			System.out.print("O instrutor deste curso ja está cadastrado? (S/N) ");
			xvld = scan.next().charAt(0);
			if (xvld == 'S' || xvld == 's') {
				System.out.print("Segue uma lista dos instrutores cadastrados: ");
				System.out.print("INSTRUTORES: \n");
				for (Exercise_2_section_19_instrutor rec : instrutores) {
					System.out.print(rec.toStringInstrutores());
				}

				Set<Exercise_2_section_19_instrutor> ExistsInstrutor = null;

				while (ExistsInstrutor == null) {
					System.out.print("Selecione o ID de sua preferência: ");
					int xvldID = scan.nextInt();
					ExistsInstrutor = instrutores.stream().filter(x -> x.getID() == xvldID).collect(Collectors.toSet());

					if (ExistsInstrutor == null) {
						System.out.println("ID selecionado não existe na lista, favor revalidar!\n");
					} else {
						Object myArray[];
						myArray = ExistsInstrutor.toArray();
						instrutor = (Exercise_2_section_19_instrutor) myArray[0];
					}

				}
			} else if (xvld == 'N' || xvld == 'n') {
				System.out.print("Digite o nome do instrutor: ");
				String InstrutorName = scan.next();
				idGlobal += 1;
				instrutor = new Exercise_2_section_19_instrutor(idGlobal, InstrutorName);
				System.out.println("Instrutor Cadastrado com sucesso");
			}

			else {
				System.out.println("Esta opção é inválida, favor escolher entre (S/N)");
				xvld = null;
			}

		}

		/* INSTANCIA CURSO */

		Exercise_2_section_19_curso curso = new Exercise_2_section_19_curso(Cursoname, instrutor);

		/* CADASTRA ALUNOS NO CURSO */

		System.out.print("Quantos alunos serão inseridos no curso? ");
		int qtdAlunos = scan.nextInt();
		for (int i = 0; i < qtdAlunos; i++) {

			idGlobal += 1;
			System.out.print("Digite o nome do aluno: ");
			String nomeAluno = scan.next();
			Exercise_2_section_19_aluno aluno = new Exercise_2_section_19_aluno(idGlobal, nomeAluno);
			curso.addAluno(aluno);
		}
		System.out.println("Cadastro de alunos finalizado");

		/* ADICIONA O CURSO A CLASSE DO INSTRUTOR EM QUESTAO */

		instrutor.addCurso(curso);

		/* ADICIONA O CURSO/INSTRUTOR NO SET GLOBAL */

		cursos.add(curso);
		instrutores.add(instrutor);
	}

	public static void quantAlunos(Set<Exercise_2_section_19_instrutor> instrutores) {

		Scanner scan = new Scanner(System.in);
		Exercise_2_section_19_instrutor instrutor = null;

		System.out.print("Segue uma lista dos instrutores cadastrados: ");
		System.out.print("INSTRUTORES: \n");
		for (Exercise_2_section_19_instrutor rec : instrutores) {
			System.out.print(rec.toStringInstrutores());
		}
		Set<Exercise_2_section_19_instrutor> ExistsInstrutor = null;
		Object myArray[];

		while (ExistsInstrutor == null) {
			System.out.print("Selecione o ID de sua preferência: ");
			int xvldID = scan.nextInt();
			ExistsInstrutor = instrutores.stream().filter(x -> x.getID() == xvldID).collect(Collectors.toSet());

			if (ExistsInstrutor == null) {
				System.out.println("ID selecionado não existe na lista, favor revalidar!\n");
			} else {
				myArray = ExistsInstrutor.toArray();
				instrutor = (Exercise_2_section_19_instrutor) myArray[0];
			}

		}

		System.out.println("O instrutor " + instrutor.getName() + " tem " + instrutor.quantAlunos() + " alunos!");

	}

}
