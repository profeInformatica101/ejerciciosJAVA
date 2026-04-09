package es.iescamas;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Guardar texto en un archivo binario
 */
public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("texto.dat"));
		try {
			dos.writeUTF("Hola mundo");
			dos.writeUTF("Java binario");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			dos.close();
			System.out.println("fin");
		}
	}
}
