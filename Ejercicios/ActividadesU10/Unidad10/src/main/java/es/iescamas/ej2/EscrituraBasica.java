package es.iescamas.ej2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraBasica {
/**
 * Diseña una aplicación que pida al usuario su nombre y su edad.

Guarda estos datos en el fichero datos.txt.
Si el fichero ya existe, debe borrarse su contenido antes de escribir.
Si no existe, debe crearse.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Dime tu edad: ");
		Integer edad = sc.nextInt();
		
		File file = new File("datos.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write(nombre +  " - "  + edad);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
				
	}
	
}
