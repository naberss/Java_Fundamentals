package Programas.Exercicios_fixacao;

import java.util.Comparator;

public class Exercicio_2_section_20_classe implements Comparator<String> {

	String nome;
	String email;
	Double salario;

	public Exercicio_2_section_20_classe(String nome, String email, Double salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
