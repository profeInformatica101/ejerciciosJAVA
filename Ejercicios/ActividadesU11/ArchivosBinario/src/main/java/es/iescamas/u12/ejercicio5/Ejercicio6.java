package es.iescamas.u12.ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
Crea una lista de números:

    Elimina los pares mientras recorres la lista
    Usa Iterator correctamente

 */
public class Ejercicio6 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1,2,4,5,6,9,11,24));
		Iterator<Integer> it = numeros.iterator();
		
		while(it.hasNext()) {
			Integer num = it.next();
			if(num % 2 == 0) {
				it.remove();
			}
		}
		
		System.out.println(numeros.toString());
	}
}
