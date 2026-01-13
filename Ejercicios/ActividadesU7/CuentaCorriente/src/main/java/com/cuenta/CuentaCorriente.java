package com.cuenta;

public class CuentaCorriente {
	
	public static String NOMBREBANCO = "Banco Camas";
	
	private double saldo;
	private double limiteDeDescubierto;
	public String nombre;
	protected String dni;
	protected Banco banco;
	
	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.limiteDeDescubierto = -50.0;
		this.saldo = 0;
	}
	
	public CuentaCorriente(double saldo, double limiteDeDescubierto, String dni, Banco banco) {
		this.saldo = saldo;
		this.limiteDeDescubierto = limiteDeDescubierto;
		this.dni = dni;
		this.banco = banco;
	}
	
	
	public CuentaCorriente(double saldo) {
		this.limiteDeDescubierto = 0;
		this.saldo = saldo;
	}
	
	public CuentaCorriente(double saldo, double limiteDeDescubierto, String dni) {
		this.saldo = saldo;
		this.limiteDeDescubierto = limiteDeDescubierto;
		this.dni = dni;
	}
	
	boolean sacarDinero(double cantidad) {
		if( this.limiteDeDescubierto <=  this.saldo - cantidad) {
			this.saldo = this.saldo - cantidad;
			return true;
		}else {
			System.out.println("Has superado el límite de descubierto");
			return false;
		}
		
	}
	
	boolean ingresarDinero(double cantidad) {
		if(cantidad > 0) {
			this.saldo += cantidad;
			return true;

		}else {
			System.out.println("Tiene que ser mayor que 0 la cantidad");
			return false;
		}
			}
	void mostrarInformacion() {
		System.out.println("nombre: "+nombre+",saldo:"+saldo  + ", limiteDeDescubierto:"+ limiteDeDescubierto + ", dni:"+ dni);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getLimiteDeDescubierto() {
		return limiteDeDescubierto;
	}
	
	public static void renombrarNombreBanco(String nombre) {
		NOMBREBANCO = nombre;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
}
