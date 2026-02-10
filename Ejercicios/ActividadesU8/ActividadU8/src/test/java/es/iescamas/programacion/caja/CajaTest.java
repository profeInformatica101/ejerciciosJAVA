package es.iescamas.programacion.caja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Caja caja;

	@BeforeEach
	void setUp() throws Exception {
		caja = new Caja(200, 200, 200, Unidades.cm);
	}

	@Test
	void testGetVolumen() {
		Double resultadoEsperado = 8.0;
		Double resultado = caja.getVolumen();
		
		assertEquals(resultadoEsperado, resultado);
	}

}
