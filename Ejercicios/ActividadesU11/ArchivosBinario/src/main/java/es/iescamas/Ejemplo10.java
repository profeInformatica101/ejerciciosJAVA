package es.iescamas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Buscar por ID
 */
public class Ejemplo10 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.datos"));
		int id_a_buscar = 2;
		try {
			while(true) {
				Alumno a = (Alumno) ois.readObject();
				if(a.id == id_a_buscar) {
					System.out.println(a);
				}
			}
		}catch(EOFException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		ois.close();
	}
}
