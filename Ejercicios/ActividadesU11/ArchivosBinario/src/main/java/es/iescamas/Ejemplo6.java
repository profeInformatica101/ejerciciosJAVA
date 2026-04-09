package es.iescamas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Realizar una copia de una imagen
 */
public class Ejemplo6 {
	public static void main(String [] args) throws IOException {
		FileInputStream fis = new FileInputStream("origen.jpg");
		FileOutputStream fos = new FileOutputStream("destino.jpg");
		
		int dato;
		while((dato = fis.read()) != -1) {
			fos.write(dato);
		}
		fis.close();
		fos.close();
		
		System.out.println("fin");
	}
}
