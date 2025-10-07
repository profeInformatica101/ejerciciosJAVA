package com;

import java.util.Scanner;

/**
 * Un centro educativo nos ha pedido que diseñemos una aplicación para calcular algunos datos estadísticos 
 * de las edades de los alumnos.
 * 
 *  Se introducirán datos hasta que uno de ellas sea negativo. 
 *  La aplicación mostrará la suma de todas las edades, 
 *  la media, de cuántos alumnos hemos introducido las edades y cuántos alumnos son mayores de edad.
 *  
 *   Implementar la aplicación requerida.
 */
public class Ejercicio2 {
     public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            int edad, alumn, mediaEdad, mayorEdad, sumaEdad;
            //Contador de alumnos
            alumn = 0;
            //Contador de alumnos que son mayores de edad
            mayorEdad=0;
            //La media de todas las edades
            mediaEdad = 0;
            // Acumulador de edad
            sumaEdad = 0;
            
            do {
               System.out.println("¿Qué edad tiene el alumno?");                                                                                                                                                                                                                                                                                                                                           
               edad=sc.nextInt();
               if(edad >=0 ) {
                  alumn++; 
                  sumaEdad = sumaEdad + edad;
                  //sumaEdad += edad;
                  
                  mediaEdad = sumaEdad / alumn;
                  
               }
             if(edad > 18) {
               mayorEdad++;                                                                                                                                                                                                                                                                                                                                            
             }                                                                                                                                                                                                                                                                                                                                             
            }while(edad >= 0);
            System.out.println("La suma de edades es: "+ sumaEdad);
            System.out.println("La media de edades es: "+ mediaEdad);
            System.out.println("El total de alumnos es "+ alumn);
            System.out.println("Lo alumnos mayore de edad: "+ mayorEdad);
            
     }
                                                                                                                                                                                                                                                                                                                                              
}
