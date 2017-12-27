package br.com.alura.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {
	
	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Matos");
		pessoas.put(23, "Romulo Henrique");
		
		for (Integer key : pessoas.keySet()) {
			System.out.println(key + " - " +  pessoas.get(key));
			
		}
		/*pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		})*/;
	}
}
