package com;

public class Main {

	public static void main(String[] args) {
		//Tabla de 5 elementos
		int[] numeros = new int[5];
		numeros[0]= 0;
		numeros[1]= 1;
		numeros[2]= 3;
		numeros[3] = 4;
		numeros[4] = 10;
		
		int[] numeros2 = {3,4,5,10,20, 234, 342};
		
		int j=0;
		while(j < numeros2.length) {
			System.out.println(numeros2[j]);
			j = j + 1;
		}
		
	}

}
