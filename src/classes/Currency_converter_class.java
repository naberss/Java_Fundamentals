package classes;

public class Currency_converter_class {

	public static double convert(double cotacao, double valor) {

		double iof = (valor * 0.06);
		return ((valor + iof) * cotacao);
	}

}
