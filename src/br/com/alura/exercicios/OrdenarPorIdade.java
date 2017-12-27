package br.com.alura.exercicios;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator<Funcionario> {

	
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}

}
