package classes;

public class Triangulo {

	public double a, b, c;

	public double area(double a, double b, double c) {

		double p = ((a + b + c) / 2.0);
		double areaX = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return areaX;
	}
	
	
	
	
	
}
