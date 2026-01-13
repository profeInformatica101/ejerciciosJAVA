package es;

import com.cuenta.CuentaCorriente;

public class Main {

	public static void main(String[] args) {
		System.out.println("INICIO");
	 System.out.println(CuentaCorriente.NOMBREBANCO);
	 CuentaCorriente.renombrarNombreBanco("Prueba");
	 System.out.println(CuentaCorriente.NOMBREBANCO);
	 System.out.println("FIN");
	}

}
