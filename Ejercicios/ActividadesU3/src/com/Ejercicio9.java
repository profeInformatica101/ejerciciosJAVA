package com;
import java.util.Scanner;
/**
 * Un centro de investigación de la flora urbana necesita 
 * una aplicación que muestre cuál es el árbol más alto. 
 * 
 * Para ello se introducirá por teclado la altura (en centímetros) 
 * de cada árbol (terminando cuando se utilice –1 como altura). 
 * 
 * Los árboles se identifican mediante etiquetas con 
 * números únicos correlativos, comenzando en 0. 
 * 
 * Se pide diseñar una aplicación que resuelva 
 * el problema planteado.
 */
public class Ejercicio9 {
                                                                                                                                                                                                                                                                                                                                              
   public static void main(String [] args) {
         Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                        
        int altura, etiqueta=0, maxAltura=0, arbolMasAlto=0;
   
        do {
           System.out.println("Introduzca la altura del árbol: " + etiqueta);
           altura = sc.nextInt();
           if(altura > maxAltura) {
              maxAltura = altura;                                                                                                                                                                                                                                                                                                                                          
              arbolMasAlto = etiqueta;
           }
           etiqueta++;
        }while(altura != -1);
        
        System.out.println("El árbol más alto es el "+ arbolMasAlto);
        System.out.println("Con la altura "+ maxAltura);
   }

}
