package com;
/**
 * Diseñar la función eco() a la que se le pasa 
 * como parámetro un número n 
 * y muestra por pantalla n veces el mensaje “Eco ...”.
 */
public class Ejercicio1 {
	public static void main(String [] args) {
		eco(6);
		
	}
	
	/**
	 * Función que imprime 'eco ...' n veces
	 * @param n Número de veces que se repite
	 */
	public static void eco(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("Eco ...");
		}
	}
	
	

}


