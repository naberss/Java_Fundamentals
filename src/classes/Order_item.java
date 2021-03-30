package classes;

/*import entidades.enums.OrderStatus;*/

public class Order_item {
	private Integer order_id; 
	private Integer quantity;
	private Product_order product;
	private Client_order client;
	/* private OrderStatus status; */
	

	public Order_item(Integer order_id,Integer quantity, Product_order product,Client_order client) {
		this.quantity = quantity;
		this.product = product;
		this.client = client;
		this.order_id = order_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
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
	
	public Client_order getClient() {
		return client;
	}

	public void setClient(Client_order client) {
		this.client = client;
	}
	
	

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: "+this.order_id);
		sb.append(" ,"+this.product.getName());
		sb.append(", $" + this.product.getPrice());
		sb.append(", Quantity " + this.getQuantity());
		sb.append(", Subtotal " + this.getPrice() + "\n");

		return sb.toString();

	}

}
