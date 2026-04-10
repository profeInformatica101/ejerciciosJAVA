package es.iescamas;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serialización de un objeto
 */
public class Ejemplo4 {

	public static void main(String [] args) {
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.data"))){
				Persona p = new Persona("Pepe", 25);
				oos.writeObject(p);
			}catch(EOFException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		

			
			System.out.println("fin");
		}
	
	
	
}
