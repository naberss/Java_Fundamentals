package classes;

import services.MyShape;

public final class Circle extends AbstractShape implements MyShape{

	private Double radius;

	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return 3.14 * Math.pow(radius, 2);

	}

}
