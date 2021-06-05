package Programas.Exercicios_fixacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio_1_section_19 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 4);
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3, 5.5, 4.8);
		List<Object> list3 = new ArrayList<>();

		copy(list1, list3);
		printList(list3);
		copy(list2, list3);
		printList(list3);

	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number rec : source) {
			destiny.add(rec);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
	}

}
