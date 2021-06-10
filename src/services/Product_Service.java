package services;

import java.util.List;
import java.util.function.Predicate;

import classes.Produto;

public class Product_Service {

	public static double AgreggatedValue(List<Produto> prod, Predicate<Produto> criterio) {
		double sum = 0;
		for (Produto rec : prod) {
			if (criterio.test(rec)) {
				sum += rec.getPrice();
			}
		}

		return sum;
	}

}
