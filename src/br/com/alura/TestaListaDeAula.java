package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisidando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de Objetos", 20);
		Aula a3 = new Aula ("Relacionamento de Listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//é necessário primeiro criar o ToString
		System.out.println(aulas);
		
		//para usar o sort é necessario criar o CompareTo
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//ordenando por tempo, utilizando java 8
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		


	
		
	}

}
