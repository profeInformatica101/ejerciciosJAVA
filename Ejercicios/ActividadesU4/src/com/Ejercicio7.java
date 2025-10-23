package com;
/**
 * Diseñar una función que determine si un número es primo.
 */
public class Ejercicio7 {
    public static void main(String [ ] args) {
     //System.out.println("5 -->"+ esPrimo(5)) ;  
      // System.out.println("11 -->"+ esPrimo(11)) ;     
       
       
       for(int i=2; i<100; i++) {
            System.out.println(i+" -->"+ esPrimo(i)) ;                                                                                                                                                                                                                                                                                                                                     
       }
    }
    public static void Test() {}
                                                                                                                                                                                                                                                                                                                                              
     public static boolean esPrimo(int n) {
         for(int i=n-1; i>1 ; i--) {
             if(n % i == 0) {
                return false;                                                                                                                                                                                                                                                                                                                                       
             }                                                                                                                                                                                                                                                                                                                                          
         } 
         return true;
     }                                                                                                                                                                                                                                                                                                                                         
}
