package Programas.Exercicios_fixacao;

public class Exercicio_3_section_8_classe {

	public String name;
	public double notas[] = new double[3];

	public String toString() {
		String texto = this.name + "\n";

		for (int i = 0; i < this.notas.length; i++) {
			texto += "Nota do " + (i + 1) + "º trimestre: " + this.notas[i] + "\n";
		}
		return texto;
	}

	public String pass_failed(double total) {

		if (total < ((30 + 35 + 35) + (60 / 100))) {
			return "Failed by " + (60 - total) + " point(s)";
		} else
			return "Passed";
	}

	public double calcula_total() {
		double total = 0;
		for (int i = 0; i < this.notas.length; i++) {
			total += this.notas[i];
		}
		return total;
	}

}
