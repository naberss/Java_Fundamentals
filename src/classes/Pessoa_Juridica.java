package classes;

import entidades.enums.pessoas_tipo;

public class Pessoa_Juridica extends Pessoa {

	private int quantidade_funcionarios;

	public Pessoa_Juridica(String nome, Double renda_anual, int quantidade_funcionarios, pessoas_tipo pessoa_tipo) {
		super(nome, renda_anual, pessoa_tipo);
		this.quantidade_funcionarios = quantidade_funcionarios;
	}

	public int getQuantidade_funcionarios() {
		return quantidade_funcionarios;
	}

	public void setQuantidade_funcionarios(int quantidade_funcionarios) {
		this.quantidade_funcionarios = quantidade_funcionarios;
	}

	@Override
	public Double calcula_imposto() {
		double imposto_calculado = 0;
		if (quantidade_funcionarios > 10) {
			imposto_calculado = renda_anual * 0.14;
		} else {
			imposto_calculado = renda_anual * 0.16;
		}
		return imposto_calculado;
	}
}
