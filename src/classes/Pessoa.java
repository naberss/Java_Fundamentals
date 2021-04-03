package classes;

import entidades.enums.pessoas_tipo;

public abstract class Pessoa {

	protected String nome;
	protected Double renda_anual;
	protected pessoas_tipo pessoa_tipo;

	public Pessoa(String nome, Double renda_anual, pessoas_tipo pessoa_tipo) {
		this.nome = nome;
		this.renda_anual = renda_anual;
		this.pessoa_tipo = pessoa_tipo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda_anual() {
		return renda_anual;
	}

	public void setRenda_anual(Double renda_anual) {
		this.renda_anual = renda_anual;
	}

	public pessoas_tipo getPessoa_tipo() {
		return pessoa_tipo;
	}

	public void setPessoa_tipo(pessoas_tipo pessoa_tipo) {
		this.pessoa_tipo = pessoa_tipo;
	}

	public abstract Double calcula_imposto();

}
