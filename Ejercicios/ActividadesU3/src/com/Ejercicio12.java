package com;

import java.util.Scanner;

/**
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */
public class Ejercicio12 {

      public static void main(String [] args) {
            System.out.println("Dime las 5 notas: ");
            Scanner sc = new Scanner(System.in);
            int notaAlumno; 
            boolean haySuspenso = false;
           
            for(int i=0; i < 5; i = i + 1) {
                
                System.out.println("Dime una nota: ");                                                                                                                                                                                                                                                                                                                                          
                notaAlumno = sc.nextInt();  
                System.out.println("Nota " + (i+1) + ".- " + notaAlumno);
                if(notaAlumno < 5) {
                   //System.out.println("Es suspenso");
                   haySuspenso = true;                                                                                                                                                                                                                                                                                                                                           
                }
            }
            if(haySuspenso)
               System.out.println("Al menos un suspenso");
            else
               System.out.println("No hay suspensos");                                                                                                                                                                                                                                                                                                                                           
      }                                                                                                                                                                                                                                                                                                                                        
}
