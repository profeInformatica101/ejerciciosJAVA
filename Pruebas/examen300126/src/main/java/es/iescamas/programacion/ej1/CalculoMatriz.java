package es.iescamas.programacion.ej1;

public class CalculoMatriz {

	private int[][] matrizA;
	private int[][] matrizB;
	
	public CalculoMatriz(int[][] matrizA, int[][] matrizB) {
		if(esValido(matrizA) && esValido(matrizB) && matrizA.length == matrizB.length) {
			this.matrizA = matrizA;
			this.matrizB = matrizB;
		}else
			throw new IllegalArgumentException("No es una matriz correcta para operar");
		
	}

	public static boolean esValido(int[][] matriz) {
		if(matriz == null)
			return false;
		if(matriz.length == 0)
			return false;
		//total de filas
		int n = matriz.length;
		for(int i=0; i<n; i++) {
			if(matriz[i] != null && matriz[i].length != n )
				return false;
		}
		return true;
	}
	
	public int[][] sumar(){
		int n = tamMatrizCuadrada();
		int[][] matrizC = new int[n][n];
		//Realizar la suma de la matrices
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
		
		return matrizC;
	}
	
	private int tamMatrizCuadrada() {
		return matrizA.length;
	}
	
}
