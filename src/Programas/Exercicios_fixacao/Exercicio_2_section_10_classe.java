package Programas.Exercicios_fixacao;

public class Exercicio_2_section_10_classe {

	private Integer id;
	private String nome;
	private Double salario;

	public Exercicio_2_section_10_classe(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	};

	public Exercicio_2_section_10_classe() {};
	
	public Integer getID () {
		return this.id;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public Double Salario () {
		return this.salario;
	}
	
	
	public void setID (Integer id) {
		this.id = id;
	}
	
	public void getNome (String nome) {
		this.nome = nome;
	}
	
	public void Salario (Double salario) {
		this.salario = salario;
	}
	
	
	public String toString () {
		return "\n"+ 
	           "ID: " + this.id+"\n"+
			   "Nome: " + this.nome+"\n"+
			   "Salario: " + this.salario+"\n";
		}
	
	public void raise_salary (Double percent) {
		this.salario +=  (salario * (percent / 100))  ;
	}
	
	
	
}
