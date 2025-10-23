package com;
/**
 * Diseñar una función que calcule a^n, donde a es real y n entero no negativo. 
 * Realiza versión iterativa y versión recursiva.
 */
public class Ejercicio11 {
       public static void main(String [] args) throws Exception {
           System.out.println(  potenciaRecursiva(2.0, -2));                                                                                                                                                                                                                                                                                                                                          
       }
                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                              
      public static double potenciaIteriva(double a , int n) throws Exception {
            if(n < 0) {
                throw new Exception("n entero no puede ser negativo");                                                                                                                                                                                                                                                                                                                                          
            }                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                    
             double resultado = 1;
             for(int i=1 ; i <= n ; i++) {
                   resultado =   resultado * a;                                                                                                                                                                                                                                                                                                                                      
             }
             return resultado;
      }  
      
     public static double potenciaRecursiva(double a, int n) throws Exception {
            if(n < 0) {
               throw new Exception("No puede ser n negativo");                                                                                                                                                                                                                                                                                                                                           
            }                                                                                                                                                                                                                                                                                                                                       
            if(n == 0) {
                return 1;                                                                                                                                                                                                                                                                                                                                          
            }else {
               return a *  potenciaRecursiva(a, n-1 );                                                                                                                                                                                                                                                                                                                                          
            }                                                                                                                                                                                                                                                                                                                                       
     }
}
