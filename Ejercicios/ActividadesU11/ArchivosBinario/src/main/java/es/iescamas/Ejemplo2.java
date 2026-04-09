package es.iescamas;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Leer enteros de un archivo binario
 */
public class Ejemplo2 {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("numeros.dat"));
		try {
		while(true) {
			System.out.println(dis.readInt());
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		dis.close();
			
			
		
	}
	
}
