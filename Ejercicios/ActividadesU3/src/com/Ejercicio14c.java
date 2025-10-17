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
public class Ejercicio14c {
   public static void main(String [] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Dime un número: ");
	   int n = sc.nextInt();
	   
	   for(int i = n; i > 0 ; i-- ) {
		   for(int j = 0; j<i; j++) {
			   System.out.print("* ");
		   }
		   System.out.println("");
	   }
	   sc.close();
}
   }
