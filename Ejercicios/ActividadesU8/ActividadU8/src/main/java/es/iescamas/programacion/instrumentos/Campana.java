package es.iescamas.programacion.instrumentos;

public class Campana extends Instrumento{

	@Override
	public void interpretar() {
		System.out.println("Esto es una CAMPANA");
		for(Nota nota : super.melodias) {
			System.out.println(nota.toString());
		}
		
	}

}
