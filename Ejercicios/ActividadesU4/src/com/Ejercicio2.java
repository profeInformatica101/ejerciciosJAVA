package com;
/**
 * Escribir una función a la que se le 
 * pasen dos enteros y muestre todos los números comprendidos 
 * entre ellos.


 */
public class Ejercicio2 {
	public static void main(String [] args) {
		comprendidos(2,10);
	}
	
	/**
	 * Función que imprime los comprendidos entre dos números
	 * @param n
	 * @param n2
	 */
	public static void comprendidos( int n, int n2 ) {
		
		for(int i =n+1 ; i < n2 ; i++) {
			System.out.println(i);
		}
	}
}
