package classes;

import java.util.function.Function;

public class Function_class implements Function<Produto, String> {

	@Override
	public  String apply(Produto t) {
		return t.getName().toUpperCase();
	}
	
	public static String apply2(Produto t) {
		return t.getName().toUpperCase();
	}

}
