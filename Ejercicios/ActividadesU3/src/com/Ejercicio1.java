package com;

import java.util.Scanner;

/**
 * Diseñar un programa que muestre, para cada número introducido por teclado, 
 * si es par, si es positivo y su cuadrado. 
 * El proceso se repetirá hasta que el número inctroducido por teclado sea 0.
 */
public class Ejercicio1 {
  public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                         
  //Inicialización de variables
       int num, cuadrado;
      do {
   System.out.println("Dime un número: ");
     num  = sc.nextInt();                                                                                                                                                                                                                                                                                                                                  

     if(num%2==0) {
          System.out.println("Es par");                                                                                                                                                                                                                                                                                                                                         
     }else {
  System.out.println("Es impar");                                                                                                                                                                                                                                                                                                                                                  
     }
     
     if(num <0) {
        System.out.println("Es negativo");                                                                                                                                                                                                                                                                                                                                          
     }else {
        System.out.println("Es positivo");                                                                                                                                                                                                                                                                                                                                                 
     }

     cuadrado=(num*num);
    
     System.out.println("Su cuadrado es: "+ cuadrado);                                                                                                                                                                                                                                                                                                                                  
      }while(num !=0);
       
  
     System.out.println("Su número es 0");
   
  }
}
