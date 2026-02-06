package es.iescamas.programacion.hora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iescamas.programacion.hora.HoraExacta;

class HoraExactaTest {
	private HoraExacta horaExacta;

	@BeforeEach
	void setUp() throws Exception {
		horaExacta = new HoraExacta(16, 57, 20);
	}

	@Test
	void testConstructor() {
		String resultadoEsperado = "16:57:20";
		String resultado = horaExacta.toString();
		
		//Comparación
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testConstructorConParametrosInvalidos() {
	
		String mensajeEsperado = "Tiene que ser una hora correcta";
		IllegalArgumentException exception = 
				assertThrows(IllegalArgumentException.class, 
						()->{
							horaExacta = new HoraExacta(24, 57, 20); 
							});
		String mensaje = exception.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
		
		/// COMPROBAR LOS MINUTOS invalidos
		mensajeEsperado = "Los minutos tienen que tener una hora correcta";
		 exception = 
				assertThrows(IllegalArgumentException.class, 
						()->{
							horaExacta = new HoraExacta(11, 61, 20); 
							});
		 mensaje = exception.getMessage().toString();
		 
		 assertEquals(mensajeEsperado, mensaje);
		 
		 //Comprobar los segundos invalidos
		 
		 mensajeEsperado = "Los segundos no son correctos";
		 exception = 
					assertThrows(IllegalArgumentException.class, 
							()->{
								horaExacta = new HoraExacta(11, 20, -1); 
								});
		 mensaje = exception.getMessage().toString();
		 assertEquals(mensajeEsperado, mensaje);
	}
	/**
	 * setSegundo(valor): 
	 * asigna, cuando es posible, el valor indicado a los segundos.
	 */
	@Test
	void testPruebaSetSegundos() {

		assertTrue(	horaExacta.setSegundo(20));
		assertFalse(horaExacta.setSegundo(108));
		assertFalse(horaExacta.setSegundo(-1));
		horaExacta.setSegundo(30);
		String resultadoEsperado = "16:57:30";
		String resultado = horaExacta.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testIncrementoSegundos() {
		horaExacta.inc();
		String resultadoEsperado = "16:57:21";
		String resultado = horaExacta.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
		horaExacta = new HoraExacta(23, 59, 59);
		horaExacta.inc();
		resultadoEsperado = "00:00:00";
		resultado = horaExacta.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	@Test
	void testEsIgualHora() {
		HoraExacta horaExacta_2 = new HoraExacta(14,30, 02);
		

		assertFalse(horaExacta.sonIguales(horaExacta_2));
		assertTrue(horaExacta.sonIguales(new HoraExacta(16, 57, 20)));
	}

}
