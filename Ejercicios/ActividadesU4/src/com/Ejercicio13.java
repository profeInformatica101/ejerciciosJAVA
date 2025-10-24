package com;
/**
 * Calcular el factorial de n recursivamente. Recuerda que por definición 0! = 1.
 */
public class Ejercicio13 {
	
	public static void main(String [] argumentos) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n) {
		if(n == 0 ) return 1;
		else {
			return n * factorial(n -1);
		}
	}

}
