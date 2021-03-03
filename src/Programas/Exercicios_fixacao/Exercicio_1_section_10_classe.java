package Programas.Exercicios_fixacao;

public class Exercicio_1_section_10_classe {

	private String nome;
	private String email;
	private int quarto;

	public Exercicio_1_section_10_classe(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;

	}

	public String toString() {
		
		return "\nNome do estudante: "+this.nome+"\n"
			    +"Email: "+this.email+"\n"
			    +"Quarto Nº: "+this.quarto+"\n";
	}

	public String getnome() {
		return this.nome;
	}

	public String getemail() {
		return this.email;
	}

	public int getquarto() {
		return this.quarto;
	}

    public void setnome(String nome) {
    	this.nome = nome;	
    }

    public void setemail(String email) {
    	this.email = email;	
    }

    public void setquarto(int quarto) {
    	this.quarto = quarto;	
    }
    
}
