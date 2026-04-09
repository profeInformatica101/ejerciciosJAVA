package es.iescamas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerBinario {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("tino.jpg")){
			int byteLeido;
			while((byteLeido = fis.read()) != -1) {
				//System.out.println(byteLeido + " ");
				System.out.printf("%02X ", byteLeido);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
