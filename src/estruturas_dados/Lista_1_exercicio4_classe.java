package estruturas_dados;

public class Lista_1_exercicio4_classe {

	private String nome;
	private Integer faltas;
	private Double media;

	public  Lista_1_exercicio4_classe(String nome, Integer faltas, Double media) {

		this.nome = nome;
		this.media = media;
		this.faltas = faltas;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getFaltas() {
		return faltas;
	}

	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String toString() {
		return "Nome " + this.nome + " \n" + "Faltas: " + this.faltas + " \n" + "Media: " + this.media + " \n";

	}

}
