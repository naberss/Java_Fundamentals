package classes;

public class Imported_product extends Generic_product {

	private double customFee;

	public Imported_product(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	
	public double total_price() {
		return (this.price+this.customFee);
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(" $" + total_price());
		sb.append(" (Custom Fees: $"+this.customFee+")");
		return sb.toString();
	}
	
	

}
