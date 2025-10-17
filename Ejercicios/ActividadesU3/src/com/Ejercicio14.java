package com;

import java.util.Scanner;

/**
 * Pedir por consola un número n 
 * y dibujar un triángulo rectángulo de n elementos de lado,
 *  utilizando para ello asteriscos (*).
 *   Por ejemplo, para n = 4:
 *   
			* * * *
			* * *
			* *
			*
 */
public class Ejercicio14 {
   public static void main(String [] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Dime un número: ");
	   int numero = sc.nextInt();
	   
	   
	   for(int i=1; numero>i; i++) {
		   System.out.println("*");
		   int e = 0;
		   
		   while(e < i) {
			   System.out.print("*");
			   e++;
		   }
		   
	   }
	   System.out.println("*");
   }
}
