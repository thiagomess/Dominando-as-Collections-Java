package br.com.alura.exercicios;

import java.util.Set;

public class TestandoCursoComAlunosEx {
	public static void main(String[] args) {

		CursoEx javaColecoes = new CursoEx("Java Cole��es", "Rodrigo Boltrini");
		javaColecoes.adiciona(new AulaEx("Mexendo com arrayList", 21));
		javaColecoes.adiciona(new AulaEx("Percorrendo LinkedLis", 20));
		javaColecoes.adiciona(new AulaEx("Boas Praticas", 19));

		AlunoEx a1 = new AlunoEx("Thiago Gomes", 123456);
		AlunoEx a2 = new AlunoEx ("Felipe Castro", 24689);
		AlunoEx a3 = new AlunoEx("Janaina Santos", 124568);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
/*		 Set<AlunoEx> alunos = javaColecoes.getAlunos();
		 
//		 javaColecoes.matricula("joao Carlos", 1233);
		*/
		
		System.out.println("Alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {System.out.println(a);});
		
		System.out.println("\nO aluno: " + a1 + "est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		AlunoEx gomes = new AlunoEx("Thiago Gomes", 123456);
		String nome = "Thiago Gomes";
		System.out.println("E este, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(gomes));
		
		System.out.println("a1 � equals ao gomes?");
		System.out.println(a1.equals(gomes));

	}
}
