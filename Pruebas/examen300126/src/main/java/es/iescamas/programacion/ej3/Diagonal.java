package es.iescamas.programacion.ej3;

import es.iescamas.programacion.ej1.CalculoMatriz;

public class Diagonal {

	private int[][] matriz_cuadrada;
	
	public Diagonal(int[][] matriz_cuadrada) {
		if(CalculoMatriz.esValido(matriz_cuadrada)) {
			this.matriz_cuadrada = matriz_cuadrada;
		}else
			throw new IllegalArgumentException("Tiene que ser una matriz cuadrada");
	}
	
	public int sumaDiagonal() {
		int suma = 0;
		int fila = matriz_cuadrada.length -1;
		
		for(int col = 0; col<matriz_cuadrada.length; col++) {
			suma += matriz_cuadrada[fila][col];
			fila--;
		}
		return suma;
		
	}
	
}
