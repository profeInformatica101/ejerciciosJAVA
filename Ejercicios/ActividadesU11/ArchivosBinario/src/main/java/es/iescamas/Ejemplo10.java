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
	public static void main(String[] args){
		final int ID_A_BUSCAR = 2;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.datos"))){
			while(true) {
				Alumno a = (Alumno) ois.readObject();
				if(a.id == ID_A_BUSCAR) {
					System.out.println(a);
				}
			}
		}catch(EOFException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
