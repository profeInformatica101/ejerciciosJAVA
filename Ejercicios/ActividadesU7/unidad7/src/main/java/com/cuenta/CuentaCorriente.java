package com.cuenta;

public class CuentaCorriente {
	private double saldo;
	private double descubierto;
	private String nombre;
	protected String dni;
	
	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 0.0;
		this.descubierto = -50.0;
	}
	/**
	 * Sacar dinero: solo se podrá sacar 
	 * hasta el límite de descubierto. 
	 * 
	 * 
	 * El método debe indicar si la operación 
	 * ha sido posible.
	 */
	public boolean sacarDinero(double cantidad) {
		if(this.saldo - cantidad >= this.descubierto) {
			saldo = saldo - cantidad;
			return true;
		}else {
			return false;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	
	/*Ingresar dinero: incrementa el saldo*/
	public double ingresarDinero(double cantidad) {
		if(cantidad > 0) {
			this.saldo = this.saldo + cantidad;
			return this.saldo;
		}else {
		return this.saldo;
	}
		
	
	}
	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", descubierto=" + descubierto + ", nombre=" + nombre + ", dni="
				+ dni + "]";
	}
	
	public String MostrarInformacion() {
		return "[saldo=" + saldo + ", descubierto=" + descubierto + ", nombre=" + nombre + ", dni=" + dni + "]";
	}
}
