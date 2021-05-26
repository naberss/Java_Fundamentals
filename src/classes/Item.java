package classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {

	String nome;
	int quantity;
	double unit_price;
	double total_price;

	public Item(String nome, int quantity, double unit_price) {
		this.nome = nome;
		this.quantity = quantity;
		this.unit_price = unit_price;
		this.total_price = (this.quantity * this.unit_price);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		BigDecimal bd = new BigDecimal(Double.toString(this.total_price)).setScale(2, RoundingMode.HALF_UP);

		return (this.nome + "," + bd);
	}

}
