package es.iescamas.programacion.hora;

public class Hora {
	protected int hora;
	protected int minuto;
	
	public Hora(int hora, int minuto) {
		if (hora < 0 || hora > 23)
		    throw new IllegalArgumentException("Tiene que ser una hora correcta");
		if (minuto < 0 || minuto > 59)
		    throw new IllegalArgumentException("Los minutos tienen que tener una hora correcta");

		this.hora = hora;
		this.minuto = minuto;
	}
	
	/**
	 * Incrementa la hora en un minuto.
	 */
	public void inc() {
		this.minuto++;
		if(this.minuto == 60) {
			this.minuto = 0;
			this.hora++;
			if(this.hora == 24) {
				this.minuto = 0;
				this.hora = 0;
			}
		}
	}
	/**
	 * Asigna un valor, si tiene sentido, a los minutos.
	 * @param valor
	 * @return
	 */
	public boolean setMinutos(int valor) {
		if(valor >= 0 && valor<60) {
			this.minuto = valor;
			return true;
		}
		return false;
	}
	/**
	 * Asigna un valor, si tiene sentido, a la hora.
	 * @param valor
	 * @return
	 */
	public boolean setHora(int valor) {
		if(valor >= 0 && valor<24) {
			this.hora = valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", hora, minuto);
	}
	
	
	
}
