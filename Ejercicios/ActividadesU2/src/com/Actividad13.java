package com;

import java.util.Scanner;

/**
 * 
 * Actividad 13 Escribir un programa que pida una hora de la forma: hora,
 * minutos y segundos.
 * 
 * El programa debe mostrar la hora un segundo más tarde. Un ejemplo: hora
 * actual [10:41:59] → hora actual +1 segundo [10:42:00]
 * 
 */
public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundo, minuto, hora;
		

		System.out.println("Dime la hora y te la adelantare un segundo: ");
		System.out.println("¿segundo?");
		segundo = sc.nextInt();
		System.out.println("¿minutos?");
		minuto = sc.nextInt();
		System.out.println("¿hora?");
		hora = sc.nextInt();
		
		if(hora > 23 ||  minuto > 60  || minuto < 0 || segundo < 0 || segundo >60 || hora < 0 ) {
			
			System.err.println("La hora no existe");
			
		}else {
			segundo++;
			if(segundo == 60) {
				minuto++;
				segundo =0;
			
				if(minuto == 60) {
					hora++;
					minuto=0;
					
					if(hora == 24) {
						hora = 0;
					
						}
				}
			}
			
			
		
			System.out.printf("La hora es: %02d:%02d:%02d",  hora, minuto, segundo);
			
		}
		
	}
}
