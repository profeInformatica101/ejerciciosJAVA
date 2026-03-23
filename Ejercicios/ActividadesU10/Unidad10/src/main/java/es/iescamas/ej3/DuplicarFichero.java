package es.iescamas.ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DuplicarFichero {
/***
 * Crea un programa que duplique el contenido de un fichero. 
 * Realiza dos versiones:

a) Duplicar original.txt en copia.txt.
b) Pedir el nombre del fichero fuente y 
copiarlo en otro con el mismo nombre, añadiendo el prefijo copia_de_.
 */
	
	public static void main(String[] args) {
		//version_a();
		version_b();
	}
	
	public static void version_a() {
		try (BufferedReader bfr = new BufferedReader(new FileReader("original.txt")); 
				BufferedWriter bfw = new BufferedWriter(new FileWriter("copia.txt"))){
			
			String linea; 
			while((linea = bfr.readLine()) != null) {
				bfw.write(linea);
				bfw.newLine();
			}
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	public static void version_b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo: ");
		String nombreF = sc.nextLine();
		try(BufferedReader bfr = new BufferedReader(new FileReader(nombreF)); 
				BufferedWriter bfw = new BufferedWriter(new FileWriter("copia_de_"+nombreF))){
			String linea;
			while( (linea = bfr.readLine()) != null){
				bfw.write(linea);
				bfw.newLine();
			}
			
			
		}catch(Exception ex) {
			
		}
	}
}
