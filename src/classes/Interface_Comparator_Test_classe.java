package classes;

import java.util.Comparator;

public class Interface_Comparator_Test_classe implements Comparator<Produto> {
	
	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
	}

}
