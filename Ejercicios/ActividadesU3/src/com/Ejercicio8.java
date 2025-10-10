package com;

import java.util.Scanner;

/**
 * Pedir un número y calcular su factorial. 
 * Por ejemplo, el factorial de 5 se denota 5! 
 * y es igual a 5 × 4 × 3 × 2 × 1 = 120
 */
public class Ejercicio8 {
     public static void main(String[]args) {
          Scanner sc = new Scanner(System.in);   
          System.out.println("Dime un número y te dire el factorial: ");
          int n = sc.nextInt();
          // Acumulador para realizar el factorial
          int op = 1;
          
          for(int i=n; i>0; i--) {
              // System.out.println(i);
               op *= i;
          }
          System.out.println("El resultado es " + op);
     }
}
