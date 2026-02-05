package es.iescamas.programacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Hora12Test {

	Hora12 hora12;
	
	@BeforeEach
	void setUp() throws Exception {
		hora12 = new Hora12(1, 1, Periodo.AM);
	}

	@Test
	void testConstructor() {
		String resultadoEsperado = "01:01-AM";
		String resultado = hora12.toString();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testIncrementoHora() {
		hora12.inc();
		String resultadoEsperado = "01:02-AM";
		String resultado = hora12.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testSetHora() {
		hora12.setHora(22);
		
		String resultadoEsperado = "10:01-PM";
		String resultado = hora12.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
	}

}
