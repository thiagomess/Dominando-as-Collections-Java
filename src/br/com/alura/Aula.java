package br.com.alura;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTitulo() {
		return tempo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + "," + this.tempo + " minutos]";
	}

	//Para ter o CompareTo é necessário implementar a class Comparable
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	

}
