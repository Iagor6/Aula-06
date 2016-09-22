package br.com.iago.test;

import java.util.Date;

import br.com.iago.Aluno;
import br.com.iago.Disciplina;
import br.com.iago.Frequencia;
import br.com.iago.Turma;
import br.com.iago.Turno;

public class ProfessorDandoFaltaNosAlunos {
	public static void main(String[] args) {
		
		Aluno iago = new Aluno();
		iago.setNome(" Iago Almeida");
		iago.setRa(" 009003114 ");
		
		Aluno bruna = new Aluno();
		bruna.setNome(" Bruna Alves ");
		bruna.setRa(" 008002113 ");
		
		Disciplina fisica = new Disciplina();
		fisica.setNome(" Fisica Experimental ");
		fisica.setCodigo(" 12345 ");
		
		Disciplina calculo = new Disciplina();
		calculo.setNome(" Calculo II ");
		calculo.setCodigo(" 123456789 ");
		
		Turma engenharia = new Turma();
		engenharia.setPeriodo(" 2016.1 ");
		engenharia.setDescricao(" Engenharia da Computaçao ");
		engenharia.setTurno(Turno.MATUTINO);
		
		Frequencia frequencia1 = new Frequencia();
		frequencia1.setAluno(iago);
		frequencia1.setData_frequencia(new Date());
		frequencia1.setDisciplina(calculo);
		frequencia1.setFaltou(false);
		frequencia1.setTurma(engenharia);
		
		System.out.println(" O Aluno -> " + frequencia1.getAluno().getNome() + " Compareceu a aula S/N ? "+ frequencia1.getFaltou()+ " Da Turma de ->"+ frequencia1.getTurma()+ " Disciplina ->" + frequencia1.getDisciplina()+ " Na data ->"+ frequencia1.getData_frequencia());
	}

}
