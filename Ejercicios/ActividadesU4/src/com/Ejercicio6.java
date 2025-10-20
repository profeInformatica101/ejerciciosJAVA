package com;
/**
 * Crear una función que, mediante un booleano,
 *  indique si el carácter pasado como parámetro corresponde a una vocal.
 */
public class Ejercicio6 {
    char letraVocal = 'a';
    char letraConsonante = 'P';
    
    public static void main(String [] args) {
        System.out.println(letraVocal('e'));  
        System.out.println(letraVocal('h'));  
    }
    
    public static boolean letraVocal( char caracter) {
       if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
           return true;                                                                                                                                                                                                                                                                                                                                          
       }                                                                                                                                                                                                                                                                                                                                           
       return false;                                                                                                                                                                                                                                                                                                                                           
    }
    
    public static boolean letraVolcalSwitch(char caracter) {
          switch (caracter) {
              case 'a', 'e', 'i', 'o', 'u', 'A', 'E','I','O', 'U':
                  return true;                                                                                                                                                                                                                                                                                                                            
              default:
                  return false;                                                                                                                                                                                                                                                                                                          
            }                                                                                                                                                                                                                                                                                                                                     
    }
}
