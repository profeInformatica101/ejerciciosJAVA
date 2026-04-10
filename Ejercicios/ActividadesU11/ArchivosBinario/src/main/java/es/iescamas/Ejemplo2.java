package es.iescamas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Leer enteros de un archivo binario
 */
public class Ejemplo2 {
	public static void main(String[] args) {
		try(DataInputStream dis = new DataInputStream(new FileInputStream("numeros.dat")) ){
				while(true) {
					System.out.println(dis.readInt());
				}
		}catch (EOFException e) {
			System.out.println("fin");
		} catch (IOException e) {
			
		}
		
			
			
		
	}
	
}
