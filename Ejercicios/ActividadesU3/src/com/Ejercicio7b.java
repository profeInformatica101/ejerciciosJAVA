package com;

public class Ejercicio7b {
  public static void main(String [] args) {
  //Forma 1
   /**                                                                                                                                                                                                                                                                                                                                            
     int producto = 1;                                                                                                                                                                                                                                                                                                                                           
      for(int i=1; i<=19; i+=2) {
           producto *= i;                                                                                                                                                                                                                                                                                                                                         
      } 
      System.out.println("El producto de los 10 números impares es: " + producto);
  }
  */
  //Forma 2
  int producto = 1;
  int contador = 0;
  for(int i=1; contador<10; i+=2) {
       producto *= i;
       contador++;
  }
  System.out.println("El producto de los 10 es " + producto);
  
  }                                                                                                                                                                                                                                                                                                                                               
}
