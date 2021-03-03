package Programas.Exercicios_fixacao;

public class Exercicio_2_section_8_classe {

	public String name;
	public double gross_salary;
	public double tax;

	public String toString() {
		return "Nome " + this.name + ", " + "$ " + NetSalary();

	}

	public double NetSalary() {
		return (this.gross_salary - this.tax);
	}

	public void IncreaseSalary(double pct) {
		this.gross_salary += ((pct / 100) * this.gross_salary);

	}

}
