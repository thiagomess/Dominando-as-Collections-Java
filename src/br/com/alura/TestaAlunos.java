package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Thiago Gomes");
		alunos.add("Rodrigo Turini");
		alunos.add("Felipe Santos");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Carlos Matos");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			}
/*		alunos.forEach(aluno -> {System.out.println(aluno);});
*/
		
		boolean EstaMatriculado = alunos.contains("ThiagoGomes");
		System.out.println(EstaMatriculado);
		
		alunos.remove("Sergio Lopes");
		
		List <String> alunosEmLista = new ArrayList<>(alunos);
		alunosEmLista.get(1);
		
		System.out.println(alunosEmLista);
		
	}

}
