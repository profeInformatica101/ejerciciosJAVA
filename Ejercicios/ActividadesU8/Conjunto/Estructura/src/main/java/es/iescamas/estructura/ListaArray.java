package es.iescamas.estructura;

import java.util.Arrays;

public class ListaArray {

	private Integer[] tabla;
	private int numElementos;
	
	
	public ListaArray() {
		super();
		tabla = new Integer[0];
		this.numElementos = 0;
	}
	
	public int size() {
		return numElementos;
	}
	public void addFinal(Integer n) {
		 if (n == null)
	         throw new IllegalArgumentException("No puede ser null");
		
		if(numElementos >= tabla.length) {
			tabla = Arrays.copyOf(tabla, tabla.length+1);
		}
			tabla[numElementos] = n;
			numElementos++;
		
	}

	public Integer[] getTabla() {
		return tabla;
	}
	
	
	public Integer get(int index) {
		if(index < 0 || index >= numElementos)
			throw new IllegalArgumentException("Fuera de rango");
	
		return tabla[index];
	
	}
	
	public Integer remove(int index) {
		if(index < 0 || index >= numElementos)
			throw new IndexOutOfBoundsException("Fuera de rango");
	
		Integer resultado = tabla[index];
		
		//	 0   1   2   3   4   5  6
		// | 3 | 4 | 5 | 7 | 7 |  |   |numElementos=5
		// remove 1
		// | 3  |  | 5 | 7 | 7 |
		// | =  | <-  <-  <-   | numElemento=4  
		
	
		for(int i=index; i<numElementos-1; i++) {
			tabla[i] = tabla[i+1];
		}
		numElementos--;
	    this.tabla[this.numElementos] = null;
		return resultado;
	}
	
	public int indexOf(Integer n) {
		if(n == null)
			throw new IllegalArgumentException("No puede ser null");
	
		for(int i=0;i<this.size(); i++) {
			if(n.equals(tabla[i]))
				return i;
		}
		
		return -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(tabla, numElementos));
	}
	
	
	
}
