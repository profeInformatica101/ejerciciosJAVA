package com;
/**
 * Implementar la función divisoresPrimos() 
 * que muestre por consola todos los divisores primos del número pasado 
 * como parámetro.
 */
public class Ejercicio9b {
     public static void main(String [] args) {
        /// System.out.println("Divisores primos de 220");                                                                                                                                                                                                                                                                                                                                          
        divisoresPrimos(-5);                                                                                                                                                                                                                                                                                                                                  
     }
                                                                                                                                                                                                                                                                                                                                              
     public static int divisoresPrimos(int numero) {
         // Cuenta el total de divisores primos                                                                                                                                                                                                                                                                                                                                        
         int contador = 0;
         
         if(numero<1) {
               System.out.println("El número tiene que ser mayor que 1");                                                                                                                                                                                                                                                                                                                                        
         }else {   
            for(int i=2; i<numero; i++) {
                 if(Ejercicio7.esPrimo(i) && numero % i == 0) {
                    System.out.println(i);
                    contador++;
             }                                                                                                                                                                                                                                                                                                                                          
         }
         System.out.println("🍕 Hay " + contador + " divisores primos");
         }
         return contador;
     }                                                                                                                                                                                                                                                                                                                                         
}
