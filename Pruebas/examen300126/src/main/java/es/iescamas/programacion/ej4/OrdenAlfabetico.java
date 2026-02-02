package es.iescamas.programacion.ej4;

import java.util.Arrays;

public class OrdenAlfabetico {
	private String[] palabras;
	
	public OrdenAlfabetico(String[] palabras) {
		if(esValido(palabras)) {
			this.palabras = palabras;
		}else
			throw new IllegalArgumentException("No es correcto la lista de palabras");
		
	}

	private boolean esValido(String[] palabras) {
		if(palabras == null) return false;
		if(palabras.length < 1) return false;
		
		return true;
	}
	
	public void ordenar() {
		Arrays.sort(this.palabras);
	}

	public String[] getPalabras() {
		return palabras;
	}
	
	
	
}
