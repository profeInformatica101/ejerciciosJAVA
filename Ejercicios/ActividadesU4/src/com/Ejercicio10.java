package com;
/**
 * Escribir una función que decida si dos enteros positivos son amigos. 
 * Dos números son amigos si la suma de sus divisores propios 
 * (distintos de ellos mismos) es igual.
    Ejemplo 284 y 220
 */
public class Ejercicio10 {

      public static void main(String [] args) {
                                                                                                                                                                                                                                                                                                                                                    System.out.println(amigos(284, 220) ? "Son amigos" : "No son amigos");
          System.out.println(amigos(284, 220) ? "Son amigos" : "No son amigos");   
        
      }                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                              
      /**

       * Funcioón que devuelve si dos números son amigos                                                                                                                                                                                                                                                                                                                                        
       * @param num1
       * @param num2
       * @return
       */
      public static boolean amigos(int num1, int num2) {
     
          return sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1;          
          }
      /**
       * Función que dado un número de entrada calcula la suma total de sus divisores
       * @param numero
       * @return
       */
       public static int sumaDivisores(int numero) {
              int suma = 0;
              for(int i=1; i < numero ; i++) {
                   if(numero % i == 0) {
                        suma = suma + i;
                       // System.out.println(i);
                   }                                                                                                                                                                                                                                                                                                                                         
              }
              return suma;
       }
}
