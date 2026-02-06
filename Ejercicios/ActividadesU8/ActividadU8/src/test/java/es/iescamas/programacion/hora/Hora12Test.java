package es.iescamas.programacion.hora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iescamas.programacion.hora.Hora12;
import es.iescamas.programacion.hora.Periodo;

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
		
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
			hora12 = new Hora12(23, 59, Periodo.AM);
		});
		String mensajeEsperado = "A partir de las 12 es PM";
		String mensaje = ex.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
	}
	
	@Test
	void testSetHora() {
		hora12.setHora(22);
		
		String resultadoEsperado = "10:01-PM";
		String resultado = hora12.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
		assertFalse(hora12.setHora(-1));
		assertFalse(hora12.setHora(24));
		
	}
	@Test
	void testHora_Valida_rango_1_12() {
		hora12 = new Hora12(11, 59, Periodo.AM);
		hora12.inc();
		
		String resultadoEsperado = "12:00-PM";
		String resultado = hora12.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
		
	}
	@Test
	void testConstructorValido() {
		hora12 = new Hora12(23, 59, Periodo.PM);
		
		String resultadoEsperado="11:59-PM";
		String resultado=hora12.toString();
		
		assertEquals(resultadoEsperado, resultado);		
		
	}
	@Test
	void testConstructorInvalido() {
		
		
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
			hora12 = new Hora12(23, 70, Periodo.PM);
		});
		
		String mensajeEsperado = "Los minutos tienen que tener una hora correcta";
		String mensaje = ex.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
		
		ex = assertThrows(IllegalArgumentException.class, ()->{
			hora12 = new Hora12(-1, 59, Periodo.PM);
		});
		mensajeEsperado = "Tiene que ser una hora correcta";
		mensaje = ex.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
		
	}
	void testMinutos_Valida_rango_0_59() {}
	void inc_cambia_minuto() {}

}
