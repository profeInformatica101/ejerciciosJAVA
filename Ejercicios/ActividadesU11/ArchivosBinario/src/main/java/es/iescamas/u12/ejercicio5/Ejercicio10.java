package es.iescamas.u12.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**

    Une ambas listas
    Elimina duplicados
    Ordena resultado

*/
public class Ejercicio10 {
	public static void main(String [] args) {
		List<Integer> nums_1 = new ArrayList<Integer>(List.of(21,3,11,-4,3, 10, 11, 31,44,55));
		List<Integer> nums_2 = new ArrayList<Integer>(List.of(-5, 10, 23, 254, 11, -11));

		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.addAll(nums_1);
		numeros.addAll(nums_2);
		
		System.out.println(numeros);
		System.out.println(numeros.descendingSet());
	}
}
