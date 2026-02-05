package es.tabla;

import java.util.Arrays;
import java.util.function.BooleanSupplier;

public class ArrayApp {

	public int[] invertirArray(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		for (int i = 0; i < original.length; i++) {
			copia[original.length - 1 - i] = original[i];
		}
		return copia;
	}

	public double mediaPositivos(int[] t) {
		int contador = 0;
		int acumulador = 0;
		for (int num : t) {
			if (num > 0) {
				acumulador += num;
				contador++;
			}

		}
		if (contador == 0)
			return 0;
		else
			return acumulador / (double) contador;
	}

	public double mediaNegativos(int[] t) {
		int contador = 0;
		int acumulador = 0;
		for (int num : t) {
			if (num < 0) {
				acumulador += num;
				contador++;
			}

		}
		if (contador == 0)
			return 0;
		else
			return acumulador / (double) contador;
	}

	public int cuentaCeros(int[] t) {
		int contador = 0;
		for (int num : t) {
			if (num == 0) {
				contador++;
			}

		}
		return contador;
	}

	public int[] borrarElemento(int[] t, int pos) {
		if (pos >= t.length || pos < 0)
			throw new IllegalArgumentException("posicion invalida");

		int[] nueva_tabla = new int[t.length - 1];
		int j = 0;

		for (int i = 0; i < t.length; i++) {
			if (i == pos)
				continue;

			nueva_tabla[j] = t[i];
			j++;
		}

		return nueva_tabla;
	}

	public int[] sinRepetidos(int[] tablaNumero) {
		int[] sinrepetidos = {};

		for (int numero : tablaNumero) {
			if (!existe(numero, sinrepetidos)) {
				sinrepetidos = Arrays.copyOf(sinrepetidos, sinrepetidos.length + 1);
				sinrepetidos[sinrepetidos.length - 1] = numero;
			}
		}

		return sinrepetidos;
	}

	private boolean existe(int numeroBuscado, int[] tabla) {
		for (int num : tabla) {
			if (numeroBuscado == num) {
				return true;
			}
		}
		return false;
	}

	public int[] fusionOrdenada(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);

		int indice_a = 0;
		int indice_b = 0;
		int total_elementos = a.length + b.length;
		int[] ordenadas = new int[total_elementos];

		// Mientras sean los indices menores que el tamaño de la tabla
		while (indice_a < a.length && indice_b < b.length) {

			if (a[indice_a] <= b[indice_b]) {
				ordenadas[indice_a + indice_b] = a[indice_a];
				indice_a++;
			} else {
				ordenadas[indice_a + indice_b] = b[indice_b];
				indice_b++;
			}

		}

		// Completo de rellenar
		while (indice_a < a.length) {
			ordenadas[indice_a + indice_b] = a[indice_a];
			indice_a++;
		}
		while (indice_b < b.length) {
			ordenadas[indice_a + indice_b] = b[indice_b];
			indice_b++;
		}

		return ordenadas;
	}

	public int[][] separarParesImpares(int[] t) {
		int[][] paresimpares = new int[2][0];

		for (int numero : t) {
			if (numero % 2 == 0) {
				paresimpares[0] = Arrays.copyOf(paresimpares[0], paresimpares[0].length + 1);
				paresimpares[0][paresimpares[0].length - 1] = numero;

			} else {
				paresimpares[1] = Arrays.copyOf(paresimpares[1], paresimpares[1].length + 1);
				paresimpares[1][paresimpares[1].length - 1] = numero;

			}
		}

		return paresimpares;

	}

	public boolean esMatrizMagica(int[][] matriz) {
		final int TAM = 4;
		
		if(matriz.length != TAM )
			throw new IllegalArgumentException("matriz debe ser 4x4");

		for (int j = 0; j < TAM; j++) {
		    if (matriz[j].length != TAM) {
		        throw new IllegalArgumentException("matriz debe ser 4x4");
		    }
		}

		

		int sumaVector = sumaVector(obtenerColumna(matriz, 0));
		int suma_aux;

		// Comprobación de columnas
		for (int i = 1; i < matriz.length; i++) {
			suma_aux = sumaVector(obtenerColumna(matriz, i));

			if (sumaVector != suma_aux) {
				return false;
			}
		}

		// Comprobación de Fila
		for (int i = 1; i < matriz.length; i++) {
			suma_aux = sumaVector(obtenerFila(matriz, i));

			if (sumaVector != suma_aux) {
				return false;
			}
		}
		return true;
	}

	public int[] obtenerColumnaPublic(int[][] matriz, int pos_vector) {
		return obtenerColumna(matriz, pos_vector);
	}

	private int[] obtenerColumna(int[][] matriz, int pos_vector) {
		int[] columna = new int[matriz.length];
		for (int i = 0; i < matriz[pos_vector].length; i++) {
			columna[i] = matriz[i][pos_vector];
		}
		return columna;
	}

	public int[] obtenerFilaPublic(int[][] matriz, int pos_vector) {
		return obtenerFila(matriz, pos_vector);
	}

	private int[] obtenerFila(int[][] matriz, int pos_vector) {
		return matriz[pos_vector];
	}

	private int sumaVector(int[] vector) {
		int total = 0;
		for (int num : vector) {
			total += num;
		}
		return total;
	}

	public int[][] rellenaSumaIndices() {
		int[][] matriz = new int[5][5];
		
		for(int i=0; i<5; i++)
			for(int j=0;j<5;j++) {
				matriz[i][j] = i+j;
			}
		
		
		return matriz;
	}

	public Integer maximo(int[] tabla) {
		if(tabla == null)
			throw new IllegalArgumentException("array no puede ser null");
		int max = Integer.MIN_VALUE;
		
		for(int num : tabla) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}

}
