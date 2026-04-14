package es.iescamas.u12.ejercicio5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Busca claves que contengan una subcadena:

    Ej: “pe” → Pedro, Pepe

 */
public class Ejercicio11 {
	public static void main(String [] args) {
		  Map<String, Integer> alumnos = new HashMap<>();

	        alumnos.put("Pedro", 8);
	        alumnos.put("Pepe", 7);
	        alumnos.put("Ana", 9);
	        alumnos.put("Pepa", 6);
	        alumnos.put("Luis", 5);

	        String buscado = "pe".toLowerCase();

	        Iterator<Map.Entry<String, Integer>> it = alumnos.entrySet().iterator();

	        System.out.println("Resultados:");

	        while (it.hasNext()) {
	            Map.Entry<String, Integer> entry = it.next();

	            if (entry.getKey().toLowerCase().contains(buscado)) {
	                System.out.println(entry.getKey() + " -> " + entry.getValue());
	            }
	        }
	    }
	}

