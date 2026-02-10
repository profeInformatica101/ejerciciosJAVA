package es.iescamas.programacion.caja;

public class CajaCarton extends Caja {

	public CajaCarton(int ancho, int alto, int fondo, Unidades u) {
		super(ancho, alto, fondo, u);
	}

	@Override
	public double getVolumen() {
		return 0.8 * super.getVolumen();
	}
	
}
