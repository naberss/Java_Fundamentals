package Programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import classes.Predicate_Test_Class;
import classes.Produto;
import services.TEST2;

public class Predicate_Test {

	public static void main(String[] args) {
		List<Produto> prod = new ArrayList<>(Arrays.asList(new Produto("lucas", 135, 2), new Produto("davi", 185, 2),
				new Produto("sandra", 185, 3)));

		/*
		 * EXPRESSAO LAMBDA INLINE prod.removeIf(x -> x.getQuantity() == 3);
		 */

		/* IMPLEMENTAÇÃO DA INTERFACE */
		prod.removeIf(new Predicate_Test_Class());

		/* REFERENCIA PARA METODO ESTATICO */
		prod.removeIf(Produto::RandomTest);

		/* EXPRESSÃO LAMBDA DECLARADA */

		Predicate<Produto> myTest = p -> p.getQuantity() == 2;
		TEST2<Produto> myProd = (x, y) -> x.getQuantity() + y.getQuantity();

		for (Produto rec : prod) {

			System.out.println(rec.toString());
		}

	}

}
