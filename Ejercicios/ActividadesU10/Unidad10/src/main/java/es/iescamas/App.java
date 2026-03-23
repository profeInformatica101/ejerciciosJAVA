package es.iescamas;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String palabra = "Hola Mundo";
        System.out.println("Total caractares: "+ palabra.length());
        String[] prueba = palabra.split(" ");
        System.out.println("Palabras total: " + prueba.length);
    }
}
