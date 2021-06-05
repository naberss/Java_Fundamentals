package Programas;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia_Test {

	public static void main(String[] args) {
		List<Object> list1 = new ArrayList<>();
		list1.add("maria");
		list1.add(132);
		
		List<? super Number> list2 = list1;
		
		list2.add((Double)list2.get(0));
		list2.add(135);
		
		Number x = list2.get(0);
		Object y = list2.get(0);
		
		

	}

}
