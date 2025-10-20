package com;
/**
 * Repite el ejercicio anterior con una versión que calcule el máximo de 3 números.
 */
public class Ejercicio5 {
     public static void main(String [] arg) {
     
      System.out.println( mayor(8, 2, 5) + " --> " + 8);
      System.out.println( mayor(3, 2, 5) + " --> " + 5);    
      System.out.println( mayor(3, 12, 5) + " --> " + 12);       
      
      
     }
     
     public static int mayor(int n1, int n2, int n3) {
         if(n1 >= n2 && n1>=n3) {
               return n1;                                                                                                                                                                                                                                                                                                                                        
         }else if(n2>=n1 && n2>=n3) {
               return n2;                                                                                                                                                                                                                                                                                                                                        
         }else {
               return n3;                                                                                                                                                                                                                                                                                                                                        
         }
     }
     
     public static int numerosMayor(int num1, int num2, int num3) {
         int numMax = num1;
         if(num2 > numMax) {
             numMax = num2;                                                                                                                                                                                                                                                                                                                                        
         }
         if(num3 > numMax) {
             numMax = num3;                                                                                                                                                                                                                                                                                                                                             
         }
         return numMax;
     }
     public static int mayor3(int n1, int n2, int n3) {
        int mayor = Ejercicio4.mayor(n1, Ejercicio4.mayor(n2, n3)); 
        return mayor;
     }
    
}
