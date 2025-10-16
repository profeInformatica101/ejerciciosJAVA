package com;

import java.util.Scanner;

/**
 * Dadas 6 notas, 
 * escribir la cantidad de alumnos 
 *          aprobados, 
 *          condicionados (=4) 
 *          y suspenso
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir las variables
		int alumNota, aprobado=0, condicionado=0, suspenso=0;
		
		//Repetir 6 veces :: Pedir nota alumnos
		for(int indice=0; indice<6; indice++) {
			System.out.println("Dime la nota: ");
			alumNota = sc.nextInt();
			
			if(alumNota >= 5) {
				aprobado++;
			}else if(alumNota == 4) {
				condicionado++;
			}else {
				suspenso++;
			}
			
		}
		
		//Mostrar resultados
		System.out.println("Aprobados: " + aprobado);
		System.out.println("Condicionado: " + condicionado);
		System.out.println("Suspenso: " + suspenso);
	}
}
