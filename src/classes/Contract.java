package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	int number;
	Date date;
	double totalValue;
	List<Installment> installments;

	public Contract() {
	}

	public Contract(int number, Date date, double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		installments = new ArrayList<Installment>();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallments(Installment installment) {
		this.installments.add(installment);
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("\nCONTRACT:\n");
		sb.append("- Number -> " + this.number + "\n");
		sb.append("- Date -> " + sdf.format(date) + "\n");
		sb.append("- Value -> " + this.totalValue + "\n");
		sb.append("* INSTALLMENTS:\n");
		for (Installment rec : installments) {
			sb.append("#No -> " + rec.getNumber() + " Due Date -> " + sdf.format(rec.getDueDate()) + " Value -> "
					+ rec.getAmount() + "\n");
		}

		return sb.toString();

	}

}
