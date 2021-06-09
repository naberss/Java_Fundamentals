package Programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import classes.Consumer_Class;
import classes.Produto;

public class Consumer_Test {

	public static void main(String[] args) {
		List<Produto> prod = new ArrayList<>(Arrays.asList(new Produto("lucas", 135, 2), new Produto("davi", 185, 2),
				new Produto("sandra", 185, 3)));

		/* CLASSE IMPLEMENTANDO CONSUMER */
		prod.forEach(new Consumer_Class());

		/* MÉTODO ESTÁTICO IMPLEMENTANDO CONSUMER */
		prod.forEach(Consumer_Class::accept2);

		/* MÉTODO NÃO ESTÁTICO IMPLEMENTANDO CONSUMER */
		prod.forEach(Produto::accept3);

		/* EXPRESSÃO LAMBDA DECLARADA */
		Consumer_Class myClass = new Consumer_Class() {

			@Override
			public void accept(Produto t) {
				t.setPrice(t.getPrice() * 1.1);
			}
		};

		prod.forEach(myClass);

		/* EXPRESSÃO LAMBDA INLINE */
		Consumer<Produto> myprod2 = t -> t.setPrice(t.getPrice() * 1.1);

		/* SYSOUT SENDO USADO COMO CONSUMER PARAMETER NO FOR EACH */
		prod.forEach(System.out::println);

	}

}
