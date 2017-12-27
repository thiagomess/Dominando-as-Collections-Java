package br.com.alura.exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestandoIterator {
	 public static void main(String[] args) {

	        List<String> letras = new LinkedList<>();
	        letras.add("A");
	        letras.add("B");
	        letras.add("C");
	        
	        Iterator<String> it = letras.iterator();

	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	 

}
