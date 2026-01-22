package es.radio;

public class Sintonizador {
	
	private double frecuencia;
	private final double MAX_FRECUENCIA = 108.0;
	private final double MIN_FRECUENCIA = 80.0;
	private final double SALTO = 0.5;

	public Sintonizador() {
		super();
		frecuencia = 80.0;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	public void up() {
		if(frecuencia + SALTO > MAX_FRECUENCIA) {
			frecuencia = MIN_FRECUENCIA;
		}else {
			frecuencia += SALTO;
			}
	}

	public void down() {
		if(frecuencia - SALTO < MIN_FRECUENCIA) {
			frecuencia = MAX_FRECUENCIA;
		}else {
			frecuencia -= SALTO;
		}
	}
	public double display() {
		System.out.println("Sintonizado: " + this.frecuencia + "MHz");
		return frecuencia;
	}
	
}
