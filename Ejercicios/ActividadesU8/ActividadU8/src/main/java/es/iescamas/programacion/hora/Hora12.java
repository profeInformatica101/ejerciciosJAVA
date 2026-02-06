package es.iescamas.programacion.hora;

public class Hora12 extends Hora{
	protected Periodo periodo;
	
	public Hora12(int hora, int minuto, Periodo periodo) {
	    super(hora, minuto);
	    this.periodo = (hora > 12) ? Periodo.PM : periodo;
	    this.setHora(hora);
	}
	
	@Override
	public void inc() {
		super.minuto++;
		if(super.minuto>59) {
			super.minuto=0;
			super.hora++;
			if(super.hora == 12) {
				if(periodo.equals(Periodo.AM)) {
					periodo = Periodo.PM;
				}else {
					periodo = Periodo.AM;
				}
			}
		}
		
		
		if(super.hora > 12) {
			super.hora = 1;
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d-", hora, minuto) + periodo;
	}
	@Override
	public boolean setHora(int valor) {
	    if (valor < 1 || valor > 23) return false;

	    if (valor <= 12) {
	        super.hora = valor;
	        // si quieres: periodo = Periodo.AM; (depende del diseño)
	    } else {
	        super.hora = valor - 12;
	        periodo = Periodo.PM;
	    }
	    return true;
	}

}
