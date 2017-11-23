package br.com.alura.exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListasExercicios {
	
	public static void main(String[] args) {
		String aula1 = "Conhecendo as collections";
		String aula2 = "Vendo lambdas";
		String aula3 = "Aprendendo java";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.remove(1);
		
		System.out.println(aulas);
		
		
		System.out.println("A primeira aula é: "+ aulas.get(0));
		
		/*for (int i=0; i<= aulas.size(); i++) {
			System.out.println("Aulas" + aulas.get(i));
			}*/
		
	
		Collections.sort(aulas);
		System.out.println(aulas);
		
	}
		
		
}
