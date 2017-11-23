package br.com.alura;

import java.util.List;

import javax.swing.SingleSelectionModel;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleçoes do java", "Paulo SIlveira");
		

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);
        
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		
		
		System.out.println(javaColecoes.getAulas());
		
		
	}

}
