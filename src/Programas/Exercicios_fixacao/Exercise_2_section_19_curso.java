package Programas.Exercicios_fixacao;

import java.util.HashSet;
import java.util.Set;

public class Exercise_2_section_19_curso
		implements Exercise_2_section_19_curso_interface<Exercise_2_section_19_aluno, Exercise_2_section_19_instrutor> {

	protected int id;
	protected String nome;
	protected Exercise_2_section_19_instrutor instrutor;
	protected Set<Exercise_2_section_19_aluno> alunos;

	public Exercise_2_section_19_curso(String nome, Exercise_2_section_19_instrutor instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		alunos = new HashSet<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Exercise_2_section_19_instrutor getInstrutor() {
		return instrutor;
	}

	public void addAluno(Exercise_2_section_19_aluno aluno) {
		alunos.add(aluno);

	}

}
