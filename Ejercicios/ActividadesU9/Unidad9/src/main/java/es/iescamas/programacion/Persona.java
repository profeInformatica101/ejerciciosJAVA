package es.iescamas.programacion;

public class Persona implements Comparable<Persona>{
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		return this.edad - o.edad;
	}
	
}
