package com.cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	CuentaCorriente cc;
	
	@BeforeEach
	void setUp() throws Exception {
	  cc = new CuentaCorriente("Juan", "12345678Z");
	}

	@Test
	@DisplayName("Prueba del constructor")
	void testPruebaUnitariaConstructor() {
	
		
		double saldoEsperado = 0;
		double saldo = cc.getSaldo();
		
		double limiteDeDescubiertoEsperado = -50;
		double limiteDeDescubierto = cc.getLimiteDeDescubierto();
		
		String nombreEsperado = "Juan";
		String nombre = cc.getNombre();
		
		String dniEsperado = "12345678Z";
		String dni = cc.getDni();
		
		
		assertEquals(saldoEsperado, saldo, "Se esperaba que fuera 0");
		assertEquals(nombreEsperado, nombre);
		assertEquals(dniEsperado, dni);
		assertEquals(limiteDeDescubiertoEsperado, limiteDeDescubierto);
	}

	
	@Test
	@DisplayName("Sacar dinero positivo")
	void testSacarDinero() {
	
		assertTrue(cc.sacarDinero(20));
	}
	@Test
	@DisplayName("Sacar dinero negativo")
	void testSacarDineroNegativo() {
		assertFalse(cc.sacarDinero(-3));
	}
	
	
}
