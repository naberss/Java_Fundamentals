package Programas.Exercicios_fixacao;

import java.util.HashSet;
import java.util.Set;

public class Exercise_2_section_19_instrutor extends Exercise_2_section_19_usuario {

	protected Set<Exercise_2_section_19_curso> cursos;
	protected Set<Exercise_2_section_19_aluno> alunos;

	public Exercise_2_section_19_instrutor(int ID, String name) {
		super(ID, name);
		cursos = new HashSet<>();
		alunos = new HashSet<>();
	}

	public void addCurso(Exercise_2_section_19_curso curso) {
		cursos.add(curso);
		alunos.addAll(curso.alunos);
	}

	public int quantAlunos() {
		return alunos.size();
	}

	public String toStringInstrutores() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + this.ID);
		sb.append("/ ");
		sb.append("Nome: " + this.name);
		sb.append("\n");

		return sb.toString();
	}

}
