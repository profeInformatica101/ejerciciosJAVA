package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConjuntoTest {

	private Conjunto conjunto;
	
	@BeforeEach
	void setUp() throws Exception {
		conjunto = new Conjunto(); 
	}

	@Test
	@DisplayName("Prueba del constructor")
	void testNumeroElemento() {
		int numeroElementoEsperado = 0;
		int numeroElemento = conjunto.numeroElementos();
		
		assertEquals(numeroElementoEsperado, numeroElemento, "Deberia ser 0 porque es un Conjunto inicializado");
	}
	
	@Test
	void testInsertar() {
		conjunto.insertar(1);
		conjunto.insertar(2);
		conjunto.insertar(5);
		
		int numeroElementoEsperado = 3;
		int numeroElemento = conjunto.numeroElementos();
		
		assertEquals(numeroElementoEsperado, numeroElemento);
	}
	
	@Test
	void testAnadir() {
		Conjunto conjunto2 = new Conjunto();
		
		conjunto.insertar(4);
		conjunto.insertar(1);
		conjunto.insertar(7);
		
		conjunto2.anadirElementosDe(conjunto);
		
		String resultadoEsperado = "{4, 1, 7}";
		String resultado = conjunto2.toString();
		
		assertEquals(resultadoEsperado, resultado);

		String mensajeEsperado = "No puede ser nulo";
		NullPointerException ex = assertThrows(NullPointerException.class,()->conjunto2.anadirElementosDe(null));
		String mensaje = ex.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
	}
	
	@Test
	void testEliminarElemento() {
		conjunto.insertar(10);
		conjunto.insertar(2);
		
		conjunto.elminarElemento(2);
		
		int totalEsperado = 1;
		int total = conjunto.numeroElementos();
		
		assertEquals(totalEsperado, total);
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->conjunto.elminarElemento(null));
		String mensajeEsperado = "No puede ser null";
		String mensaje = exception.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
		
	}
	
	@Test
	void testEliminarTodos() {
		conjunto.insertar(1);
		conjunto.insertar(2);
		//#####################
		//#  conjunto = {1,2} #
		//#####################
		
		Conjunto conjunto2 = new Conjunto();
		conjunto2.insertar(4);
		conjunto2.insertar(2);
		//#####################
	    //#  conjunto2 = {4,2}  #
        //#####################
		
		//eliminarTodos
		conjunto.eliminarTodos(conjunto2);
		//conjunto = {1}
		
		int numTotalElementosEsperado = 1;
		int numTotalElementos = conjunto.numeroElementos();
		
		assertEquals( numTotalElementosEsperado , numTotalElementos);
		
		Integer[] tablaEsperada = {1, null};
		Integer[] tabla = conjunto.getTabla();
		
		assertArrayEquals(tablaEsperada, tabla);
	}
	
	@Test
	void testToString() {
		conjunto.insertar(7);
		conjunto.insertar(8);
		
		String str = conjunto.toString();
		
		assertTrue(str.contains("7"));
		assertTrue(str.contains("8"));
		assertTrue(str.startsWith("{"));
		assertTrue(str.endsWith("}"));
	}
	
	@Test
	void testMinimo() {
		conjunto.insertar(1);
		conjunto.insertar(2);
		conjunto.insertar(3);
		
		int numeroEsperado = 1;
		int numeroMin = conjunto.minimo();
		
		assertEquals(numeroEsperado,numeroMin);
		
		
	}
	
	@Test
	void testMaximo() {
		conjunto.insertar(1);
		conjunto.insertar(8);
		conjunto.insertar(-4);
		
		int resultadoEsperado = 8;
		int resultado = conjunto.maximo();
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	@DisplayName("Prueba Máximo de un conjunto vacío")
	void testMaximoConjuntoVacio() {
		NoSuchElementException exception
		= assertThrows(NoSuchElementException.class, ()->conjunto.maximo());
		
		String mensajeEsperado = "Conjunto vacío";
		String mensaje = exception.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
	}
}
