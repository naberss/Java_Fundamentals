package Programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import classes.Function_class;
import classes.Produto;

public class Function_Test {

	public static void main(String[] args) {

		List<Produto> prod = new ArrayList<>(Arrays.asList(new Produto("lucas", 135, 2), new Produto("davi", 185, 2),
				new Produto("sandra", 185, 3)));

		/* USANDO COMO PARAMETRO DO MAP INSTANCIA DE CLASSE QUE IMPLEMENTA A INTERFACE FUNCTION */
		List<String> myStringList = prod.stream().map(new Function_class()).collect(Collectors.toList());
		
		/* USANDO COMO PARAMETRO DO MAP MÉTODO ESTATICO DE CLASSE QUE IMPLEMENTA A INTERFACE FUNCTION */
		List<String> myStringList2 = prod.stream().map(Function_class::apply2).collect(Collectors.toList());
		
		/* USANDO COMO PARAMETRO DO MAP MÉTODO NÃO ESTATICO DE CLASSE */
		List<String> myStringList3 = prod.stream().map(Produto::apply).collect(Collectors.toList());
		
		/* USANDO EXPRESSÃO LAMBDA DECLARADA */
		Function<Produto,String> myFunc = p -> p.getName().toUpperCase();
		
		List<String> myStringList4 = prod.stream().map(myFunc).collect(Collectors.toList());
		
		/* USANDO EXPRESSÃO LAMBDA INLINE */
		List<String> myStringList5 = prod.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

	}

}
