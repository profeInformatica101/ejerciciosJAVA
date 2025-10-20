package com;

import java.util.Scanner;

/**
 * Realizar una función que calcule y muestre el área o el volumen de un cilindro, 
 * según se especifique.
        - Opción 1: área. 
        - Opción 2: volumen. 
   Además se pasa el radio de la base y la altura.

    Fórmulas:
         área = 2 · π · r · (h + r)
      volumen = π · r² · h
 */
public class Ejercicio3 {

        public static void main(String[]args) {
             System.out.println("Dime que quieres calcular (1) Area o (2) Volumen: ");                                                                                                                                                                                                                                                                                                                                         
             Scanner sc = new Scanner(System.in);
                          
             double radio_, altura_;
             int opcion_;
             do {
             System.out.println("Dime el radio: ");
             radio_ = sc.nextDouble();
             
             System.out.println("Dime la altura: ");
             altura_ = sc.nextDouble();
             
             System.out.println("Dime la opción: ");
             opcion_ = sc.nextInt();
             
             }while(radio_ < 0 || altura_ < 0 || opcion_ < 0);
             
             // Mostramos los resultados
             cilindro(radio_, altura_, opcion_);                                                                                                                                                                                                                                                                                                                                         
        }                                                                                                                                                                                                                                                                                                                                      
        public static void cilindro(double radio  , double altura, int opcion ) {
            switch (opcion) {
             case 1:
               double area = 2 * Math.PI * radio * (altura + radio); 
               System.out.println("El área es : " + area);
             break;                                                                                                                                                                                                                                                                                                                                 
             case 2:
               double volumen = Math.PI * Math.pow(radio, 2) * altura;                                                                                                                                                                                                                                                                                                                                           
               System.out.println("El volumen es :" + volumen);
               break;                                                                                                                                                                                                                                                                                                                                              
            default:
                System.out.println("No se ha seleccionado la opción correcta");                                                                                                                                                                                                                                                                                                                                           
         }
                                                                                                                                                                                                                                                                                                                                   
            
             
             
             
             
            
           
             
             
        }
        
}
