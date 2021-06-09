package classes;

import java.util.function.Consumer;

public class Consumer_Class extends Produto implements Consumer<Produto> {
	
	
	public Consumer_Class() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Produto t) {
		t.setPrice(t.getPrice() * 1.1);

	}

	
	public static void accept2(Produto t) {
		t.setPrice(t.getPrice() * 1.1);

	}
	
	@Override
	public void accept3() {
		setPrice(getPrice() * 1.1);

	}
}
