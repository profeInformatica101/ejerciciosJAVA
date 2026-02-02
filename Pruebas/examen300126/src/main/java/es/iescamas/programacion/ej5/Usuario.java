package es.iescamas.programacion.ej5;

public class Usuario {
	private String nombre;
	private int edad;
	private String email;
	private String ciudad;
	
	public Usuario(String nombre, int edad, String email, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.ciudad = ciudad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
