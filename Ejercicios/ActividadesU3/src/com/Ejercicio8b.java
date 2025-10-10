package com;

import java.util.Scanner;

/**
 * Pedir un número y calcular su factorial. 
 * Por ejemplo, el factorial de 5 se denota 5! 
 * y es igual a 5 × 4 × 3 × 2 × 1 = 120
 */
public class Ejercicio8b {

    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                           
       //Pedir al usuario un número
                                                                                                                                                                                                                                                                                                                                         
        System.out.println("Dime un número: ");                                                                                                                                                                                                                                                                                                                                          
        int n = sc.nextInt();                                                                                                                                                                                                                                                                                                                                          
        int factorial = 1; 
        while( n > 0 ) {
           // n--; 
         factorial *= n; //factorial = factorial * n;                                                                                                                                                                                                                                                                                                                                             
         
         n=n-1;//n-=1;//n--;
          
        }                                                                                                                                                                                                                                                                                                                                        
        System.out.println(factorial);                                                                                                                                                                                                                                                                                                                                        
    }                                                                                                                                                                                                                                                                                                                                          
}
