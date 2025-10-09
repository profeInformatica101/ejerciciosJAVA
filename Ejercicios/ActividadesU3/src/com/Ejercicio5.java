package com;

import java.util.Scanner;

/**
 * Desarrollar un programa que solicite los valores mínimo y máximo de un rango. 
 * A continuación solicitará por teclado un número que debe estar dentro del rango.
 *  Si el valor introducido no pertenence al rango, la aplicación volverá a pedir otro valor
 * , y así repetidas veces, 
 * hasta que el valor se encuentre dentro del rango.
 */
public class Ejercicio5 {
   public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int max, min, num;
        /***
         * ##############
         * #    Obtenemos el Max y el Min
         * #############
         */
        System.out.println("Introduce un rango de valores: ");
        System.out.println("Max: ");
        max = sc.nextInt();
        System.out.println("Min: ");
        min = sc.nextInt();
        
        if(min > max) {
            int aux = max;
            max = min;
            min = aux;
    
        }
        
        if( min == max) {
           System.out.println("Has introducido el mismo valor, y no hay valor dentro de ese rango");                                                                                                                                                                                                                                                                                                                                         
        }else {
        
        System.out.println("Ahora introduce un valor dentro del rango: ");
        num = sc.nextInt();
        
        while(num > max || min > num) {
               System.out.println("No está dentro del rango, prueba otra vez: ");                                                                                                                                                                                                                                                                                                                                       
               num = sc.nextInt();
        }
        
        System.out.println(num + "está dentro del rango (min: "+ min + "y max: " + max + ")" );
        }
   }
}
