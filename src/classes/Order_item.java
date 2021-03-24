package classes;

public class Order_item {
	private Integer quantity;
	private Product_order product;

	public Order_item(Integer quantity, Product_order product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return (this.quantity * this.product.getPrice());
	}

	public Product_order getProduct() {
		return product;
	}

	public void setProduct(Product_order product) {
		this.product = product;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.product.getName());
		sb.append(", $" + this.product.getPrice());
		sb.append(", Quantity " + this.getQuantity());
		sb.append(", Subtotal " + this.getPrice() + "\n");

		return sb.toString();

	}

}
