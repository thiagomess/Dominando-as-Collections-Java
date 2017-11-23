package br.com.alura.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2Ex {
	public static void main(String[] args) {
		
		CursoEx javaColecoes = new CursoEx("Java Coleções", "Rodrigo Boltrini");
		javaColecoes.adiciona(new AulaEx("Mexendo com arrayList", 21));
		javaColecoes.adiciona(new AulaEx("Percorrendo LinkedLis", 20));
		javaColecoes.adiciona(new AulaEx("Boas Praticas", 19));
		
		List<AulaEx> aulasImutaveis =  javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<AulaEx> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
		
		
		
	}

}
