package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String intrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

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

}