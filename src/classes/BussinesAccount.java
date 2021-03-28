package classes;

public class BussinesAccount extends Account {

	double loanlimit;

	public BussinesAccount() {
		super();
	}

	public BussinesAccount(int number, String holder, double balance, double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;

	}

	public void loan(double amount) {

		this.balance = (amount + 10);

	}

	@Override
	public void withdraw(double number) {
		this.balance = (this.balance - number);
	}

}
