package classes;

public class Invoice {

	private Double basicPayment;
	private Double tax;
	/* Double totalPayment; */

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public double getTotalPayment() {
		return (getBasicPayment() + getTax());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("INVOICE: \n");
		sb.append("Basic Payment - " + this.basicPayment + "\n");
		sb.append("Tax - " + this.tax + "\n");
		sb.append("Total Payment - " + getTotalPayment());

		return sb.toString();
	}

}
