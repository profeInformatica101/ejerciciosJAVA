package com;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 *  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 *  Recordamos que existen meses con 28, 30 y 31 días. 
 *  No consideraremos los años bisiestos. 
 */
public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variables
	  
		int dia, mes, anno;
		boolean fechaCorrecta = true;
		int diaMax = -1;
		
		System.out.println("Dame un día: ");
		dia = sc.nextInt();
		
		System.out.println("Dame un mes: ");
		mes = sc.nextInt();
		
		System.out.println("Dame el año: ");
		anno = sc.nextInt();
		
		
		/**
		 * ##############
		 * #   Comprobar el MES si es correcto
		 * ################
		 */
		
		if((mes < 1) || (mes>12)) {
			//System.out.println();
			fechaCorrecta = false;
		}else {
			// Fecha correcta
			diaMax = 31; // ENERO (1)  - MARZO(3)  - MAYO(5) - JULIO (7)  - AGOSTO(8) - Octubre (10) - Diciembre (12)
			
			if(  mes == 2 ) { // FEBRERO (2)
				diaMax = 28;
			}else if((mes == 4 ) || (mes == 6) || (mes == 9) || (mes == 11)) { // Abril(4) - Junio(6) - Septiembre(9) - Noviembre (11)
				diaMax = 30;
			}
			
		}
		/**
		 * ##############
		 * #   Comprobar el DÍA si es correcto
		 * ################
		 */
		if(dia < 1 || dia > diaMax) {
			fechaCorrecta = false;
		}
		
		/**
		 * ##############
		 * #   Comprobar el AÑO si es correcto
		 * ################
		 */
		if((anno < 1) || (anno > 2025)) {
			fechaCorrecta = false;
		} 
		
		// COMPROBAMOS SI LA FECHA CORRECTA
		if(fechaCorrecta) {
			System.out.println("La fecha es correcta." + dia + "/" + mes + "/" +  anno);
		}else {
			System.err.println("La fecha es incorrecta.");
		}
		
		
	}

}
