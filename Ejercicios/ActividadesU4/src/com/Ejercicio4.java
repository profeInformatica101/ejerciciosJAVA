package com;
/**
 * Diseñar una función que reciba como parámetros dos números enteros 
 * y que devuelva el mayor de los dos.
 */
public class Ejercicio4 {
    public static void main(String [] args) {
         System.out.println(mayor(5,8)+1);                                                                                                                                                                                                                                                                                                                                         
    }
                                                                                                                                                                                                                                                                                                                                              
    /**
     * Función que devuelve el mayor de dos números                                                                                                                                                                                                                                                                                                                                          
     * @param a
     * @param b
     * @return
     */
    public static int mayor(int a, int b) {
        if(a > b) { 
           return a;                                                                                                                                                                                                                                                                                                                                           
        }else {
           return b;
        }
        
    } 
    

}
