package com;
//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10
public class Ejercicio11 {
     public static void main(String [] args) {
          /***
           * Declaramos las variables                                                                                                                                                                                                                                                                                                                                         
           */
         int num1, num2, resultado;
         num1 = 1;
         num2 = 1;
         
         while(num2 <= 10) {
              resultado = num1 * num2;
              System.out.println(num1 + " x " + num2 + " = " + resultado);
              
              if(num1 < 10) {
                  num1++;                                                                                                                                                                                                                                                                                                                                          
              }else {
                  num1 = 1;
                  num2++;
              }
         }
     }
                                                                                                                                                                                                                                                                                                                                              
}
