package com.programacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calculadora = new Calculadora();

	@Test
	void testSuma() {
		int resultadoEsperado = 10;
		int resultado = calculadora.sumar(4, 6);
		assertEquals(resultadoEsperado, resultado, "La suma no es correcta");
	}

}
