package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Used_product extends Generic_product {

	private Date manufactureDate;

	public Used_product(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		SimpleDateFormat sdf1 =  new SimpleDateFormat("dd/MM/yyyy"); 
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(" $" + this.price);
		sb.append(" (Manufacture Date: "+sdf1.format(manufactureDate)+")");
		return sb.toString();
	}
	
	
}
