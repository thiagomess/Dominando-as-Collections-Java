package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String intrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaPorAluno = new HashMap<>();

	public String getNome() {
		return nome;
	}

	public String getIntrutor() {
		return intrutor;
	}

	public Curso(String nome, String intrutor) {
		this.nome = nome;
		this.intrutor = intrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// Metodo normal
	/*
	 * public int getTempoTotal() { 
	 * int tempoTotal = 0; 
	 * for (Aula aula : aulas) {
	 * tempoTotal += aula.getTempo();
	 * 
	 * } return tempoTotal; }
	 */

	// metodo no java 8
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaPorAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
/*
	public Aluno buscaMatriculado(int numero) {
		for (Aluno aluno : alunos) {
			if(aluno.getNumeroMatricula() == numero)
				return aluno;
		}
		throw new NoSuchElementException("Matricula não encontrada" + numero);
	} */
	
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaPorAluno.containsKey(numero)) {
			throw new NoSuchElementException("Matricula nao encontrada" + numero);
		}
			return matriculaPorAluno.get(numero);
		}
	
}
