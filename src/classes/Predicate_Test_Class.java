package classes;

import java.util.function.Predicate;

public class Predicate_Test_Class implements Predicate<Produto> {

	@Override
	public boolean test(Produto t) {
		return t.getQuantity() == 3;
	}

}
