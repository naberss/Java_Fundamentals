package classes;

public class Triangulo extends AbstractShape {

	public double a, b, c;

	public Triangulo(Color color) {
		super(color);
	}

	public Triangulo() {
		super();
	}

	@Override
	public Double area() {

		double p = ((a + b + c) / 2.0);
		double areaX = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return areaX;
	}

}
