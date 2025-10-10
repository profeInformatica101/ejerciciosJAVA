package com;
/**
 * Escribir todos los múltiplos de 7 menores que 100.
 */
public class Ejercicio6 {
    public static void main(String[]args) {
     /*  Forma 1            */  
    /**                                                                                                                                                                                                                                                                                                                                              
       for(int n = 0; n<100; n++) {
           if(n%7 == 0) {                                                                                                                                                                                                                                                                                                                                          
             System.out.println(n);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
           }
       }  */
    /* Forma 2 */                                                                                                                                                                                                                                                                                                                                              
  /**   for(int n= 0; n<100; n+=7) {
       System.out.println(n);                                                                                                                                                                                                                                                                                                                              
     }*/
   /* Forma 3 <- falta el 0 */ 
/**  int multiplo = 7;
  int numero = 0;
  int operacion = 0;
  while(operacion < 100) {
        numero++;
        operacion = multiplo * numero;
        if(operacion < 100) {
             System.out.println("7 x " + numero + " = " + operacion);                                                                                                                                                                                                                                                                                                                                         
        }
  }*/
  
  /* Forma 4 */
 /** int n = 0;
  while(n < 100) {
      System.out.println(n);                                                                                                                                                                                                                                                                                                                                 
      n+=7;                                                                                                                                                                                                                                                                                                                                           
  }*/
    /* Forma 5 */
   int n = 0;                                                                                                                                                                                                                                                                                                                                               
  do {
    System.out.println(n);                                                                                                                                                                                                                                                                                                                                       
     n = n + 7; // n += 7;

  }while( n < 100  );
  //
} 
}
