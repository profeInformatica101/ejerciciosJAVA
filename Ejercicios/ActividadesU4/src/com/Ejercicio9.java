package com;
/**
 * Implementar la función divisoresPrimos() 
 * que muestre por consola todos los divisores primos del número pasado como parámetro.
 */
public class Ejercicio9 {
     public static void main(String [] args) {
           divisores(42);                                                                                                                                                                                                                                                                                                                                   
     }
     public static void divisores(int numero) {
          for(int i=2; i<numero; i++) {
              if(numero%i==0) {
                  //boolean esPrimo = Ejercicio7.esPrimo(i);
                  if(Ejercicio7.esPrimo(i)) {
                        System.out.println(i);                                                                                                                                                                                                                                                                                                                                        
                  }
              }                                                                                                                                                                                                                                                                                                                                         
          }                                                                                                                                                                                                                                                                                                                                         
     }
}
