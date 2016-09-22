package br.com.iago;

import java.util.Date;

public class Frequencia {
	private Long id;
	private Boolean faltou;
	private Date data_frequencia;
	private Aluno aluno;
	private Disciplina disciplina;
	private Turma turma;

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Boolean getFaltou() {
		return faltou;
	}

	public void setFaltou(Boolean faltou) {
		this.faltou = faltou;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData_frequencia() {
		return data_frequencia;
	}

	public void setData_frequencia(Date data_frequencia) {
		this.data_frequencia = data_frequencia;
	}

}
