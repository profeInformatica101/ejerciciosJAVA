package es.iescamas.programacion.hora;

public class HoraExacta extends Hora{

	private int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if(segundos > 60 || segundos<0) throw new IllegalArgumentException("Los segundos no son correctos");
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundos);
	}

	public boolean setSegundo(int valor) {
		if(valor < 0 || valor>60) 
			return false;
		this.segundos = valor;
			return true;
	}
	@Override
	public void inc() {
		segundos++;
		if(this.segundos >=60) {
			segundos = 0;
			super.inc();
		}
	}

	public boolean sonIguales(HoraExacta horaExacta2) {
		boolean sonIgualesHoras =  (this.hora == horaExacta2.hora);
		boolean sonIgualesMinutos = (this.minuto == horaExacta2.minuto);
		boolean sonIgualesSegundos = (this.segundos == horaExacta2.segundos);
		return sonIgualesHoras && sonIgualesMinutos && sonIgualesSegundos;
	}

}
