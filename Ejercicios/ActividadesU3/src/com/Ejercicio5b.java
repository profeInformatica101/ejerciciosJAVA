package com;

import java.util.Scanner;

/**
 * Desarrollar un programa que solicite los valores mínimo y máximo de un rango. 
 * A continuación solicitará por teclado un número que debe estar dentro del rango.
 *  Si el valor introducido no pertenence al rango, la aplicación volverá a pedir otro valor
 * , y así repetidas veces, 
 * hasta que el valor se encuentre dentro del rango.
 */
public class Ejercicio5b {
   public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // n es el primero numero y m el segundo
        // x es el número que se encuentra dentro del rango (m,n)
        int n, m, x;
        
        System.out.println("Dime un número");
        n = sc.nextInt();
        System.out.println("Dime otro número");
        m = sc.nextInt();
        
        System.out.println("Dime un número que se encuentre en el rango de los números introducidos");
        
        x = sc.nextInt();
        
        while(x > n && x > m || x <n && x < m) {
             System.out.println("Dime otro número que este dentro del rango");
             x = sc.nextInt();
             
            // x = x1;
        }
        
        System.out.println("El número x " + x + "esta dentro del rango");
   }
}
