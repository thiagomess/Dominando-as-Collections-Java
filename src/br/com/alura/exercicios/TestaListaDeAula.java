package br.com.alura.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		AulaEx a1 = new AulaEx ("Revisando as Array", 17);
		AulaEx a2 = new AulaEx ("Lista de Objetos", 12);
		AulaEx a3 = new AulaEx ("Relacionamento de listas", 22);
		
		ArrayList<AulaEx> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(AulaEx::getTempo));
		System.out.println(aulas);
	}

}
