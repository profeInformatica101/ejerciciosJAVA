package es.iescamas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Borar un Objeto
 */
public class Ejemplo12 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.datos"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.data"));
		int id_a_borrar = 2;
		
		try {
			while(true) {
				Alumno a = (Alumno) ois.readObject();
				if(a.id != id_a_borrar) {
					oos.writeObject(a);
				}
				
			}
		}catch(EOFException ex) {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ois.close();
		oos.close();
		
		
		new File("temp.data").renameTo(new File("alumnos.datos"));
	}
	
}
