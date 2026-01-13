package com.cuenta;

public class Banco {
	private String nombre;
	private Double capital;
	private String direccion;
	
	public Banco(String nombre) {
		this.nombre = nombre;
		this.capital = 5_200_000.0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Double getCapital() {
		return capital;
	}

	public void setCapital(Double capital) {
		this.capital = capital;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
