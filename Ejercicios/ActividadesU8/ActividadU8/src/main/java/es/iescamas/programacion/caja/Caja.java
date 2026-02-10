package es.iescamas.programacion.caja;

public class Caja {

	private final int ancho, alto, fondo;
	private Unidades u;
	
	
	public Caja(int ancho, int alto, int fondo, Unidades u) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo  = fondo;
		this.u = u;
	}
	
	public double getVolumen() {
		double volumen = this.ancho * this.alto * this.fondo; 
		if(this.u.equals(Unidades.cm)) {
			volumen = volumen / 1_000_000.0;
		} 
		return volumen;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", u=" + u + "]";
	}

	
	
	
}
