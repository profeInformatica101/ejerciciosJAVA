package es.iescamas.ej1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaBasica {
/**
 * Realiza un programa que solicite al usuario 
 * el nombre de un fichero de texto 
 * y muestre su contenido en pantalla.

	Si el usuario no introduce ningún nombre, 
	usa por defecto prueba.txt.

	Muestra el contenido línea a línea.
 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dime el nombre del fichero: ");
		String nombreFichero = sc.nextLine();

		if(nombreFichero == "") {
			nombreFichero = "prueba.txt";
		}
		System.out.println(nombreFichero);
		
		try (BufferedReader bf = new BufferedReader(new FileReader(nombreFichero))){
			String linea;
			while((linea = bf.readLine()) != null) {
				System.out.println(linea);
			}
				
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	
		
	}
	
}
