package es.iescamas.programacion.instrumentos;

public class Piano  extends Instrumento{

	public Piano() {
		super();
	}
	
	
	@Override
	public void interpretar() {
		System.out.println("Esto es un PIANO: ");
		for(Nota nota: super.melodias) {
			System.out.println(nota.toString());
		}
		
	}


}
