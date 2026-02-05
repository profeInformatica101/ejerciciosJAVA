package es.iescamas.programacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HoraTest {

	private Hora hora;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		hora = new Hora(10,5);
	}

	@Test
	@DisplayName("Constructor con argumentos invalidos")
	void testConstructorConArgumentosInvalidos() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, 
				()->{ hora = new Hora(-1,3);});
		
		String mensajeEsperado = "Tiene que ser una hora correcta";
		String mensaje = ex.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
	}
	
	@Test
	@DisplayName("Prueba de toString")
	void testtoString() {
		String horaEsperada = "10:05";
		String horaCadena = hora.toString();
		assertEquals(horaEsperada, horaCadena);
	}
	
	@Test
	@DisplayName("Prueba Unitaria de Set Hora")
	void testsetHora_validaRango_0_23() {
		assertFalse(hora.setHora(-1));
		assertFalse(hora.setHora(24));
		assertTrue(hora.setHora(0));
		assertTrue(hora.setHora(23));
	}
	

	@Test
	@DisplayName("Prueba de incremento")
	void testInc() {
		String resutadoEsperado = "10:06";
		//Ejecuto
		hora.inc();
		String resultado = hora.toString();
	
		//Compruebo
		assertEquals(resutadoEsperado, resultado);
		
	}
	@Test
	void testIncYvuelveEmpezar() {
		Hora hora = new Hora(23,59);
		hora.inc();
		
		String resultadoEsperado = "00:00";
		String resultado = hora.toString();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	@DisplayName("Prueba unitaria de set e incremento")
	void testSetYInc() {
		hora.setHora(23);
		hora.setMinutos(59);
		hora.inc();
		
		String resultadoEsperado = "00:00";
		String resultado = hora.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	
	

}
