package es.iescamas.programacion;

import java.util.Comparator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
       
    }
    
    public static void InterfaceLambda() {
    	  Operacion suma = (x, y)-> x + y;
          System.out.println(suma.aplica(3, 4));
          Operacion resta = (x, y)-> x - y;
          System.out.println(resta.aplica(4, 2));
    }
}
