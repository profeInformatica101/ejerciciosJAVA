package com;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nota de 0-10:");
		int num = sc.nextInt();
		
		String nota = switch (num) {
		case 0, 1, 2, 3, 4 -> "Insuficiente";
		case 5 -> "Suficiente";
		case 6 -> "Bien";
		case 7,8 -> "Notable";
		case 9, 10 -> "Sobresaliente";
		default -> "Error";
		};
		
		if (nota != "Error") {
			System.out.println("Has sacado un " + nota);
		} else {
			System.out.println("Has introducido una nota NO válida");
		}
		
	}

}