package com;
import java.util.Scanner;
/**
 * Escribir una aplicación para aprender a contar, 
 * que pedirá un número n 
 * y mostrará todos los números del 1 a n.
 */
public class Ejercicio4 {
   public static void main(String [] args) {
         Scanner sc =  new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                        
         
         int n; 
       
         do {
                                                                                                                                                                                                                                                                                                                                                       
            System.out.println("Dime un número <n>");
            n = sc.nextInt();
         }while(n <= 1);
         
         
         System.out.println("Esto son los números del 1 al " + n);
         for(int i = 1; i <= n; i++ ) {
            System.out.println(i);                                                                                                                                                                                                                                                                                                                                            
         }
         
         
   }
         
        
   
  
                                                                                                                                                                                                                                                                                                                                         

}
