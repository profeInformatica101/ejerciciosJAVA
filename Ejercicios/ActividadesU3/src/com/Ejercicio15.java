package com;

import java.util.Scanner;

/**
 * Realizar un programa que nos pida un número n,
 *  y nos diga cuántos números hay entre 2 
 *  y n que sean primos. Un número primo es
 *   aquél que solo es divisible por 1 
 *   y por él mismo. Veamos un ejemplo para n = 8:

2 → primo
3 → primo
4 → no primo
5 → primo
6 → no primo
7 → primo
8 → no primo
 */
public class Ejercicio15 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Dime un número: ");
			n = sc.nextInt();
		}while(n<0);
		
		
		for(int i=2; i<=n; i++) {
			if(esPrimo(i)) {
				imprime(i + "→ primo");
			}else {
				imprime(i + "→ no primo");
			}
			
		}
		
		
	}
	
	/**
	 * Función que devuelve si un número es Primo
	 * @param numero
	 * @return
	 */
	public static boolean esPrimo(int numero) {
		boolean dev = true;
		
		for(int i=2; i<numero-1; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		
		return dev;
	}
	
	public static void imprime(String cadena) {
		System.out.println(cadena);
	}

}
