package classes;

import entidades.enums.pessoas_tipo;

public class Pessoa_Fisica extends Pessoa {

	private double gastos_saude;

	public Pessoa_Fisica(String nome, Double renda_anual, double gastos_saude,pessoas_tipo pessoa_tipo) {
		super(nome, renda_anual,pessoa_tipo);
		this.gastos_saude = gastos_saude;

	}

	public double getGastos_saude() {
		return gastos_saude;
	}

	public void setGastos_saude(double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}

	@Override
	public Double calcula_imposto() {
		double gasto_saude_calculado = 0;
		double imposto_calculado;

		if (gastos_saude > 0) {
			gasto_saude_calculado = (this.gastos_saude / 2);
		}

		if ((gasto_saude_calculado + renda_anual) > 20000) {
			imposto_calculado = (gasto_saude_calculado + renda_anual) * 0.25 ;
		} else {
			imposto_calculado = (gasto_saude_calculado + renda_anual) * 0.15;
		}

		return imposto_calculado;
	}

}
