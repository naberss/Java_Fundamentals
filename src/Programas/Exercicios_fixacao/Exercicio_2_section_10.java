package Programas.Exercicios_fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_2_section_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;

		List<Exercicio_2_section_10_classe> list = new ArrayList<>();
		Exercicio_2_section_10_classe add_job = new Exercicio_2_section_10_classe();
		Integer id = 0;

		do {

			System.out.println("\n Bem vindo ao programinha, por favor digite a opção desejada conforme sua operação \n"
					+ "1 - Adicionar um funcionário\n" + "2 - Aumentar o salário do funcionário\n"
					+ "3 - Remover funcionário\n" + "4 - Listar funcionário\n" + "5 - Sair do programa\n ");

			x = scan.nextInt();
			Integer id_find;

			switch (x) {
			case 1:

				System.out.println("Digite o nome do funcionário: \\n");
				String nome = scan.next();
				System.out.println("Digite o salário do funcionário: \\n");
				Double salario = scan.nextDouble();
				id++;
				list.add(add_job = new Exercicio_2_section_10_classe(id, nome, salario));
				System.out.println("\n" + add_job);

				break;

			case 2:

				System.out.println("Digite o ID do funcionário: \n");
				id_find = scan.nextInt();

				if (find_id(list, id_find) != null) {
					System.out.println("Digite o percentual do salário a ser aumentado: \n");
					double raise = scan.nextDouble();
					raise_salary(list, id_find, raise);
				} else {
					System.out.println("ID não encontrado, favor revalidar conforme a lista\n");
				}

				break;

			case 3:

				System.out.println("Digite o ID do funcionário: ");
				id_find = scan.nextInt();
				Integer z = find_id(list, id_find);
				if (z != null) {
					list.remove(z.intValue());

					if (list.isEmpty()) {
						System.out.println("Funcionário removido, agora o sistema se encontra vázio \n");
					} else {
						System.out.println("Funcionário removido \n" + list);
					}

				} else {
					System.out.println("ID não encontrado, favor revalidar conforme a lista\n");
				}

				break;

			case 4:

				for (Exercicio_2_section_10_classe loop : list) {
					System.out.println(loop);

				}
				break;

			case 5:
				System.out.println("Saindo da aplicação \n");
				break;
			default:
				System.out.println(
						"Esta opção não se encontra disponível, tente novamente com as que são válidas via menu \n");

				break;

			}

		} while (x != 5);

		scan.close();

	}

	static Integer find_id(List<Exercicio_2_section_10_classe> list, Integer id_find) {

		/*
		 * Integer x = null; for (int i = 0; i < list.size(); i++) { if
		 * (list.get(i).getID() == id_find) { x = i; } }
		 */

		Exercicio_2_section_10_classe find_id;
		find_id = list.stream().filter(p -> p.getID() == id_find).findFirst().orElse(null);

		if (find_id != null) {

			return (find_id.getID() - 1);
		} else {
			return null;
		}

	}

	static void raise_salary(List<Exercicio_2_section_10_classe> list, Integer id_find, Double percent) {

		list.get(find_id(list, id_find)).raise_salary(percent);
		System.out.println(list);

	}

}
