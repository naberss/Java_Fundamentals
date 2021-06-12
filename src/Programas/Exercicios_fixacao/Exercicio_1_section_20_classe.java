package Programas.Exercicios_fixacao;

public class Exercicio_1_section_20_classe implements Comparable<Exercicio_1_section_20_classe> {

	String name;
	Double preco;

	public Exercicio_1_section_20_classe(String name, Double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercicio_1_section_20_classe other = (Exercicio_1_section_20_classe) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Exercicio_1_section_20_classe o) {

		int comparator = name.compareTo(o.getName());
		if (comparator != 0) {
			return comparator *= -1;
		} else {
			return 0;
		}

	}

}
