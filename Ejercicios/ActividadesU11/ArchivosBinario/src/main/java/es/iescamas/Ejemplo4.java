package es.iescamas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serialización de un objeto
 */
public class Ejemplo4 {

	public static void main(String [] args) throws FileNotFoundException, IOException {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.data"));
		
			Persona p = new Persona("Pepe", 25);
			oos.writeObject(p);
			
			oos.close();
			
			System.out.println("fin");
		}
	
	
	
}
