package Programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import classes.Produto;

public class Stream_Test {

	public static void main(String[] args) {
		List<Produto> prod = new ArrayList<>(Arrays.asList(new Produto("lucas", 135, 2), new Produto("davi", 185, 2),
				new Produto("sandra", 185, 3)));

		List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3));

		/* CRIANDO STREAMS ATRAVÉS DE ESTRUTURAS DE DADOS */

		Stream<Produto> st = prod.stream();

		/* IMPRIMINDO OS DADOS INCLUSOS EM UMA STREAM ATRAVÉS DE SEU PARSE PARA ARRAY, E 
		 * A UTILIZAÇÃO DE UM METODO ITERATIVO QUE PRINTA O CONTEUDO DE ARRAYS */
		System.out.println(Arrays.toString(st.toArray()));

		/* CRIANDO STREAMS MANUALMENTE */

		Stream<Produto> st1 = Stream.of(new Produto("pera", 535, 8), new Produto("banana", 188, 32),
				new Produto("shakira", 13256, 3));

		/* CRIANDO UMA STREAM DE POTENCIAL INFINITO */

		// Sequencia de Fibonacci
		Stream<Integer> st2 = Stream.iterate(new Integer[] { 0, 1 }, p -> new Integer[] { p[1], p[0] + p[1] }).map(p -> p[0]);

		/*
		 * EXIBINDO E LIMITANDO A QUANTIDADE DE CARACTERES PARA QUE ELE NÃO PRINTE
		 * INFINITAMENTE
		 */

		System.out.println(Arrays.toString(st2.limit(10).toArray()));

	}

}
