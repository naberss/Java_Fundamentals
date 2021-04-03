package classes;

public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	protected abstract Double area();
	
	

}
