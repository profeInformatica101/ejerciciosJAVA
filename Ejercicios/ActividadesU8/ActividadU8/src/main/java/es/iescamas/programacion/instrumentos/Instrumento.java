package es.iescamas.programacion.instrumentos;

import java.util.Arrays;

public abstract class Instrumento {
		final int MAX = 100;
		protected Nota[] melodias;
		//protected int numNotas;
		
		public Instrumento() {
			melodias = new Nota[0];
		}
		
		public abstract void interpretar();
		
		public boolean add(Nota n) {
			if(melodias.length<MAX) {
				melodias = Arrays.copyOf(melodias, melodias.length+1);
				melodias[melodias.length-1] = n;
				return true;
			}else {
				return false;
			}
		}
	
		
		
		
}
