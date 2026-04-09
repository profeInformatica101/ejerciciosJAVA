package es.iescamas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copiar archivos de audio 
 */
public class Ejemplo7 {
	public static void main(String [] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("origen.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destino.mp3"));
	
		int dato;
		while((dato = bis.read()) != -1) {
			bos.write(dato);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("fin");
	}
}
