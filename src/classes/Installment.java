package classes;

import java.util.Date;

public class Installment {

	Date dueDate;
	double amount;
	int number;

	public Installment(Date dueDate, double amount, int number) {
		this.dueDate = dueDate;
		this.amount = amount;
		this.number = number;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
