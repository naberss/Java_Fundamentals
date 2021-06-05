package classes;

import services.MyShape;

public final class Rectangle extends AbstractShape implements MyShape {

	private Double width;
	private Double height;

	public Rectangle(Double width, Double height, Color color) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		return (this.height * this.width);

	}

}
