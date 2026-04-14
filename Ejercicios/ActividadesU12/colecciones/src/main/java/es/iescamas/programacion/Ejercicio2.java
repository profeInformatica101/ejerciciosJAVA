package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Dada una lista con números repetidos:

- Introduce valores manualmente
- Elimina duplicados usando un Set
- Muestra resultado final
 */
public class Ejercicio2 {

	public static void main(String [] args) {
		
		List<Integer> lista= new ArrayList<Integer>();
		lista.add(1);
		lista.add(1);
		lista.add(2);
		System.out.println("Total: " + lista.size());
		
		Set<Integer> conjunto = new HashSet<Integer>(lista);
		//conjunto.addAll(lista);
		System.out.println("Total: " + conjunto.size());
		
		List<Integer> lista2 = new ArrayList<Integer>(conjunto);
		for(Integer i : lista2) {
			System.out.println(i);
		}
	}
}
