package br.com.alura.exercicios;


public class AulaEx implements Comparable<AulaEx> {
	
	private String titulo;
	private int tempo;
	
	public AulaEx(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(AulaEx outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	

}	
