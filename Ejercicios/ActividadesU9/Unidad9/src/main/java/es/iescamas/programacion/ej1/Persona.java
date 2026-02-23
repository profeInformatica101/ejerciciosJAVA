package es.iescamas.programacion.ej1;

public class Persona implements Imprimible {

	
	String nombre;

	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "test";
	}
	
}
