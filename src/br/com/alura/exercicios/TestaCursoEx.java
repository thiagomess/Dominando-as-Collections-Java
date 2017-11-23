package br.com.alura.exercicios;

import java.util.List;

public class TestaCursoEx {
	
	public static void main(String[] args) {
		
		CursoEx javaColecoes = new CursoEx("Trabalhando com classes", "Mauricio Campos");
		List<AulaEx> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adiciona(new AulaEx("Vendo listas",21));
		
		System.out.println(aulas);
		
	}

}
