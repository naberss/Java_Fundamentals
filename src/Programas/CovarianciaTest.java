package Programas;

import java.util.ArrayList;
import java.util.List;

public class CovarianciaTest {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(35);
		list1.add(44);

		List<? extends Number> list2 = new ArrayList<>();

		list2 = list1;

		list2.get(0);]

		list2.add(35);

	}

}
