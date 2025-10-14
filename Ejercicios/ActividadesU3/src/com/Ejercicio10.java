package com;

import java.util.Scanner;

/**
 * Se desea implementar una aplicación que pida al usuario que introduzca un número comprendido entre 1 y 10.
 *  Debemos mostrar la tabla de multiplicar de dicho número.
 *  El código tendrá que asegurarse de que el número introducido se encuentra entre el 1 y el 10.
 */
public class Ejercicio10 {

     public static void main(String [] args) {
           Scanner sc = new Scanner(System.in);
           int numero;
          
           
           do {
          System.out.println("Dime un número entre 1 y 10");                                                                                                                                                                                                                                                                                                                                        
           numero = sc.nextInt();
          System.out.println("Numero: "+ numero);                                                                                                                                                                                                                                                                                                                                                                        
           }while(numero<0 || numero>10);
         
           int mult, i=0;
           while(i<= 10) {
               mult = i * numero;                                                                                                                                                                                                                                                                                                                                          
               System.out.println(numero + " x " + i + " = " + mult);
               i = i + 1;
           }
           
           
     
     }                                                                                                                                                                                                                                                                                                                                         
}
