package Programas.Exercicios_fixacao;

public interface Exercise_2_section_19_curso_interface<T extends Exercise_2_section_19_aluno, Y extends Exercise_2_section_19_instrutor> {

	void addAluno(T aluno);

	public int getId();

	public void setId(int id);

	public String getNome();

	public void setNome(String nome);

	public Exercise_2_section_19_instrutor getInstrutor();

}
