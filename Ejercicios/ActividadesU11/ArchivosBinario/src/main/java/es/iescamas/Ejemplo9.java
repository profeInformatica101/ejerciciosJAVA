package es.iescamas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejemplo9 {
	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.datos"))) {

		    while (true) {
		        Alumno a = (Alumno) ois.readObject();
		        System.out.println(a);
		    }

		} catch (EOFException e) {
		    System.out.println("Fin del fichero");

		} catch (IOException | ClassNotFoundException e) {
		    e.printStackTrace();
		}
		
	}
}
