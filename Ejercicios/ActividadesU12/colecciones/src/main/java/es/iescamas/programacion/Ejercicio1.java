package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

/*
 * Crea una lista de números enteros:

Añade 10 números introducidos por teclado
Muestra todos los valores
Calcula suma y media
 */
public class Ejercicio1 {
	public static void main(String [] args) {
		List<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		Integer num_aux;
		
	
		//Solicito los números
		for(int i=0; i<10; i++) {
			System.out.println("dime un número");
			num_aux = sc.nextInt();
			lista.add(num_aux);
		}
		
		mostrar_valores(lista);
		int total = calcula_suma(lista);
		double media = media(lista);
	
		System.out.println("Total: " + total + "Media" + media);
		
		
	}

	private static double media(List<Integer> lista) {
		double media = (double) calcula_suma(lista) / lista.size();
		return media;
		
	}

	private static int calcula_suma(List<Integer> lista) {
		Integer suma = 0;
		for(Integer num : lista) {
			suma+=num;
		}
		return suma;
	}

	private static void mostrar_valores(List<Integer> lista) {
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
	}
}
