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
public class Ejercicio14b {
   public static void main(String [] args) {
	   Scanner sc = new Scanner(System.in);
	   // Creamos dos variables contadores
	   int n, s, num;
	   
	   System.out.println("Dime un número para crear un triangulo con *: " );
	   num = sc.nextInt();
	   
	   while(num > 0) {
		   System.out.print("*");
		   s=num-1;
		   while(s>0) {
			   System.out.print("*");
		       s= s-1;
		   }
		   num--;
		   System.out.println("");
	   }
	 
   }
}
