package com;
/**
 * Escribir una función que, dado un entero, 
 * devuelva el número de divisores primos que tiene.
 */
public class Ejercicio8 {
   public static void main(String [] args) {
     System.out.println(divisoresPrimos(4));
     System.out.println(divisoresPrimos(10));  
     System.out.println(divisoresPrimos(30));
     System.out.println(divisoresPrimos(42));
   }
   public static int divisoresPrimos(int numero) {
        int contador = 0;
        for(int i=2; i < numero ; i++) {
            if(Ejercicio7.esPrimo(i) && numero % i == 0) {
              contador++;                                                                                                                                                                                                                                                                                                                                           
            }                                                                                                                                                                                                                                                                                                                                          
        }
        return contador;                                                                                                                                                                                                                                                                                                                                    
   }                                                                                                                                                                                                                                                                                                                                           
}
