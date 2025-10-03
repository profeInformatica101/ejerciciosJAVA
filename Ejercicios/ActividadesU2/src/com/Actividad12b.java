package com;

import java.util.Scanner;

/**
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 * Recordamos que existen meses con 28, 30 y 31 días. No consideraremos los años
 * bisiestos.
 */
public class Actividad12b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables
		int dia, mes, anno;
		boolean fechaCorrecta = true;
	
		System.out.println("Dame un día: ");
		dia = sc.nextInt();

		System.out.println("Dame un mes: ");
		mes = sc.nextInt();

		System.out.println("Dame el año: ");
		anno = sc.nextInt();

		if (mes < 1 || mes > 12) {
			fechaCorrecta = false;
		} else {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12: {
				if (dia < 1 || dia > 31) {
					fechaCorrecta = false;
				}

			}
				break;
			case 4, 6, 9, 11: {
				if (dia < 1 || dia > 30) {
					fechaCorrecta = false;
				}

			}
				break;

			case 2:{
				if (dia < 1 || dia > 28) {
					fechaCorrecta = false;
				}

			}
			break;
			}

		}
		if(anno < 0 ) {
			fechaCorrecta = false;
		}
		
		if(fechaCorrecta) {
			System.out.println("La fecha introducida es correcta " +  dia + "/" + mes + "/" + anno);
		}else {
			System.err.println("La fecha es incorrecta");
		}
		
		sc.close();
		
	}
}


