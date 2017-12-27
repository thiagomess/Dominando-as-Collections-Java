package br.com.alura.exercicios;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Thiago", 29);
		Funcionario f2 = new Funcionario("Artur", 23);
		Funcionario f3 = new Funcionario("Mateus",25);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		System.out.println("Ordena funcionarios do mais novo de idade para o mais velho:");
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}
	

}
