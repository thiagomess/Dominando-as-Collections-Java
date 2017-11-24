package br.com.alura.exercicios;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



public class CursoEx {
	
	private String nome;
    private String instrutor;
    private List<AulaEx> aulas = new LinkedList<AulaEx>();
    private Set<AlunoEx> alunosEx = new HashSet<>();
    
    public CursoEx(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<AulaEx> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(AulaEx aula) {
    	this.aulas.add(aula);
    }
    
    
    public int getTempoTotal() {
    	int tempoTotal = 0;    	
		for (AulaEx aulaEx : aulas) {
			tempoTotal += aulaEx.getTempo();
			
			
		}
		return tempoTotal;

	}
    
    @Override
    public String toString() {
    	return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas:  " + this.aulas + "]";
    }
    
    public void matricula(AlunoEx aluno) {
    	this.alunosEx.add(aluno);
	}
    
	public Set<AlunoEx> getAlunos() {
		return Collections.unmodifiableSet(alunosEx);
	}

	public boolean estaMatriculado(AlunoEx alunoEx) {
	
		return this.alunosEx.contains(alunoEx);
	} 
    


}
