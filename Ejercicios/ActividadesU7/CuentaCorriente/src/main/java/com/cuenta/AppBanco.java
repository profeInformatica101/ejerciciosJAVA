package com.cuenta;

public class AppBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("PruebaBanco");
		CuentaCorriente cc = new CuentaCorriente(2, -50, "12345678", banco);
		
		System.out.println(cc.getBanco().getNombre());
	}

}
