package es.iescamas;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * [C]RUD de Objetos en un Archivo Binario
 * CREAR
 */
public class Ejemplo8 {
	public static void main(String [] args) throws Exception{
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.datos"))){
			oos.writeObject(new Alumno(1, "Maria", 10));
			oos.writeObject(new Alumno(2, "Rocio", 5));
			oos.writeObject(new Alumno(3, "Juan", 6));
		}catch(EOFException ex){
			System.out.println(ex.toString());
		}
		System.out.println("Fin");
		
	}
}
