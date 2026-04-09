package es.iescamas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Leer un objeto de un archivo binario
 */
public class Ejemplo5 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.data"));
		try {
			Persona p = (Persona) ois.readObject();
			System.out.println(p);
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
