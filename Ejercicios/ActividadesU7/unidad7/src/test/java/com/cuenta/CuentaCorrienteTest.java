package com.cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	CuentaCorriente cc;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Este se ejecuta solo al inicio. Una sola vez");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Antes de cada @Test");
		cc = new CuentaCorriente("Juan", "12345678A");
	}

	@Test
	@DisplayName("Prueba para ver tras el constructor el saldo")
	void testSacarDinero() {
		cc.sacarDinero(10);
		double saldoEsperado = -10.0;
		double saldo = cc.getSaldo();
		assertEquals(saldoEsperado, saldo);
		
	}
	
	@Test
	void testSacarDinero2(){
		cc.sacarDinero(30);
		double saldoEsperado = -30.0;
		double saldo = cc.getSaldo();
		assertEquals(saldoEsperado, saldo);
	}
	@Test
	@DisplayName("Tras el constructor, ingresar -10 de cantidad, debe ser 0")
	void testIngresarDinero() {
		cc.ingresarDinero(-10);
		double saldoEsperado = 0;
		double saldo = cc.getSaldo();
		assertEquals(saldoEsperado, saldo);
	}
	
	@Test
	@DisplayName("Tras el constructor, ingresar 30 de cantidad, debe ser 30")
	void testIngresarDinero2() {
		cc.ingresarDinero(30);
		double saldoEsperado = 30;
		double saldo = cc.getSaldo();
		assertEquals(saldoEsperado, saldo, "El resultado de ingresar dinero no es correcto");
	}
	
	@Test
	void testMostrarInformacion() {
		cc.ingresarDinero(30);
		String mensajeEsperado = "[saldo=30.0, descubierto=-50.0, nombre=Juan, dni=12345678A]";
		String mensaje = cc.MostrarInformacion();
		assertEquals(mensajeEsperado, mensaje);
	}
	

}
