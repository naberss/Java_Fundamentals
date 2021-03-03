package Programas.Exercicios_fixacao;

public class Exercicio_1_section_9_classe {

	private int acc_number;
	private String name;
	private double value;

	public Exercicio_1_section_9_classe(int acc_number, String name) {
		this.acc_number = acc_number;
		this.name = name;
	}

	public int getAcc_Number() {
		return this.acc_number;
	}

	public String getName() {
		return this.name;
	}

	public double getvalue() {
		return this.value;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String toString() {

		return "\nAccount data -> " + "\n" + "Account number: " + this.acc_number + "\n" + "Holder: " + this.name + "\n"
				+ "Balance: " + this.value + "\n";

	}

	public void cash_out(double cash_out) {
		this.value -= (cash_out + 5);
	}
	
	public void cash_in(double cash_in) {
		this.value += (cash_in);
	}
	
}
