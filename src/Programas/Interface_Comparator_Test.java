package Programas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import classes.Interface_Comparator_Test_classe;
import classes.Produto;
import services.TEST;

public class Interface_Comparator_Test {

	public static void main(String[] args) {
		List<Produto> myProd = new ArrayList<>();

		myProd.add(new Produto("macaco", 135));
		myProd.add(new Produto("banana", 175));

		/* ORDENA OS ITENS DA LISTA A PARTIR DO MÉTODO DE COMPARAÇÃO DEFINIDO NA CLASSE INTERFACE_COMPARATOR_TEST_CLASSE */
		myProd.sort(new Interface_Comparator_Test_classe());

		/* IMPLEMENTANDO UMA INTERFACE ANÔNIMA NO BLOCO PRINCIPAL */
		
		Comparator<Produto> comp = new Comparator<Produto>() {
			@Override 
			public int compare(Produto o1, Produto o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}

		};

		TEST<Integer> test = new TEST<Integer>() {

			@Override
			public int myinttest(Integer t1) {
				// TODO Auto-generated method stub
				return 0;
			}

		};

		/* IMPLEMENTANDO UMA FUNÇÃO ANONIMA BASEADA EM UM EXPRESSÃO LAMBDA (ARROW FUNCTION) */

		Comparator<Produto> comp2 = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		

		TEST<Integer> test2 = (t1) -> (t1+35);
		
	}
}