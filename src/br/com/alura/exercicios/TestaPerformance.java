package br.com.alura.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class TestaPerformance {
	public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio_ins = System.currentTimeMillis();

        for (int i = 1; i <= 1000000; i++) {
            numeros.add(i);
        }
        long fim_ins = System.currentTimeMillis();
        
        long tempoDeExecIns =  fim_ins - inicio_ins;
        
        System.out.println("Tempo gasto para Inserir: " + tempoDeExecIns);
        
        long inicio_bus = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim_bus = System.currentTimeMillis();
        
        long tempoDeExecBus =   fim_bus - inicio_bus;
        
        System.out.println("Tempo gasto para buscar: " + tempoDeExecBus);

        long tempoDeExecucao = fim_bus - inicio_ins;

        System.out.println("Tempo gasto total: " + tempoDeExecucao);

    }
}
