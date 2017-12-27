package br.com.alura;

public class TestaBuscaAlunosCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		
		Aluno a1 = new Aluno ("Rodrigo Turini", 38456);
		Aluno a2 = new Aluno ("Guilherme Silveira", 12345);
		Aluno a3 = new Aluno("Mauricio Castro", 45678);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula  45678?");
		Aluno aluno = javaColecoes.buscaMatriculado(45678);
		System.out.println("Aluno :" + aluno);
	}
}
