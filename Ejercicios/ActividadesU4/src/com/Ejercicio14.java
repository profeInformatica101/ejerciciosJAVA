package com;
/**
 * Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci:
f(0) = 1, f(1) = 1 y f(n) = f(n-1) + f(n-2) para n ≥ 2.
 */
public class Ejercicio14 {

	public static void main(String [] argumentos) throws Exception {
		//f(2) --> 2
		//f(3) --> 3
		//f(4) --> 5
		
		
		System.out.println(f(-5));
	}
	
	public static int f(int n) throws Exception {
		if(n < 0) throw new Exception("No se puede calcular con un número negativo");
		
		if(n == 0) return 1; 
		if(n == 1) return 1;
		else
			return f(n-1) + f(n-2);
	}
}
