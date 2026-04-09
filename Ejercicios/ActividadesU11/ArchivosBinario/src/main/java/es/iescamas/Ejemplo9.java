package es.iescamas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejemplo9 {
	public static void main(String[] args) throws Exception, IOException {
		ObjectInputStream ois = null;
		try {
			FileInputStream file = new FileInputStream("alumnos.datos");
			ois = new ObjectInputStream(file);
			
			while(true) {
				Alumno a = (Alumno) ois.readObject();
				System.out.println(a);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ois.close();
			
		}
		
	}
}
