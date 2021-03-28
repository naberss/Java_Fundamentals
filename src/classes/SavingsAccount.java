package classes;

public class SavingsAccount extends Account {

	private double interestrate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int number, String holder, double balance, double interestrate) {
		super(number, holder, balance);
		this.interestrate = interestrate;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	public void updatebalance() {
		balance += balance * this.interestrate;
	}

}
