package com;
/**
 * Diseñar un programa que muestre el producto de los 10 primeros números impares.
654.729.075
 */
public class Ejercicio7 {
    public static void main(String [] args) {
        // Mostrar los 10 primeros números impares
       int producto=1, n = 1;
       while(n < 20) {
         //System.out.println("### Producto :"+producto); 
         producto *= n;
        
         // System.out.println(n);
          n += 2;
       } 
       System.out.println("El producto :"+producto); 
    }
}
