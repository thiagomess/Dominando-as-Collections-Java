package br.com.alura;

public class TestaCursoComAluno {
	
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
		
		System.out.println("Todos os alunos matriculados: " );
		javaColecoes.getAlunos().forEach(a ->{System.out.println(a);});
		
		
		//Aula 7 - quando é necessário comparar dois elementos, é necessário criar os metodos hashcode e equals.
		System.out.println("O aluno " + a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		
		
		Aluno turini = new Aluno("Rodrigo Turini", 38456);
		String nome = "Rodrigo Turini";
		System.out.println("E este Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		//obrigatoriamente o seguinte é true
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
	}

}
