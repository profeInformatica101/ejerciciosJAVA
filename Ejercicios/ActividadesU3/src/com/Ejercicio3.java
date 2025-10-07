package com;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

/**
 * Realizar el juego el número secreto, que consiste en acertar un número desconocido 
 * (generado aleatoriamente entre 1 y 100). 
 * 
 * Para ello se leen por teclado una serie de números, para los que se indica:
 *  «mayor» o «menor»,
 *   según sea mayor o menor con respecto al número secreto.
 *   
 *    El proceso termina cuando el usuario acierta o cuando se rinde 
 *    (introduciendo un –1).
 */
public class Ejercicio3 {
    public static void main(String [] args) {
         Scanner sc = new Scanner(System.in);
         Random random = new Random();
        
         // Inicializar número aleatorio secreto
         int numeroSecreto = random.nextInt(100) + 1;
         System.out.println("para borrar #######"+numeroSecreto);
         // Variable para que el usuario agrege el número 
         int intento = 0;
         
         System.out.println("Adivine el número entre 1 y 100:");
         System.out.println("Introduce -1 para salir");
         
         while(true) {
              System.out.println("Escribe un número");
              intento = sc.nextInt();
              
              if(intento == -1) {
                   System.out.println("Te has rendido");
                   break;
              }
              
          
              if(intento == numeroSecreto) {
                  System.out.println("Has acertado el número");
                  break;
              }else if(intento > numeroSecreto) {
                   System.out.println("Es menor");                                                                                                                                                                                                                                                                                                                                         
              }else if(intento < numeroSecreto) {
                    System.out.println("Es mayor");                                                                                                                                                                                                                                                                                                                                        
              }
                   
         
         }
         
    }
}
