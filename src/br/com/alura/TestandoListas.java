package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		
		//removendo o primeiro elemento
		aulas.remove(0);

		System.out.println(aulas);
		
		//utilizando o foreach

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		//imprimindo a primeira aula
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		//usando o for normal
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		
		//visualizando o tamanho da array

		System.out.println(aulas.size());
		
		//utilizando o novo for do java 8 (lambda)

		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println("ordenado: " + aulas);
		
		
		
		
	}

}
