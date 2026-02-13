package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColaArrayTest {
	
	private ColaArray cola;

	@BeforeEach
	void setUp() throws Exception {
		cola = new ColaArray();
	}

	@Test
	void testConstructor() {
		int resultadoEsperado = 0;
		int resultado = cola.size();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testEnqueue() {
		cola.enqueue(3);
		
		int resultadoEsperado = 1;
		int resultado = cola.size();
		
		assertEquals(resultadoEsperado, resultado);
		
		cola.enqueue(null);
		resultadoEsperado = 1;
		resultado = cola.size();
		
		assertEquals(resultadoEsperado, resultado);
		
		cola.enqueue(3);
		
		Integer[] tablaActual = cola.getTabla();
		Integer[] tablaEsperada = {3,3};
		assertArrayEquals(tablaEsperada, tablaActual);
		
		resultadoEsperado = 2;
		resultado = cola.size();
		assertEquals(resultadoEsperado, resultado);
		
		
	}
	
	@Test
	void testDequeue() {
		Integer resultado = cola.dequeue();
		Integer resultadoEsperado = null;
		
		assertEquals(resultadoEsperado, resultado);
		
		cola.enqueue(18);
		resultado = cola.dequeue();
		resultadoEsperado = 18;
		
		assertEquals(resultadoEsperado, resultado);
		assertEquals(0, cola.size());
		
		cola.enqueue(3);
		cola.enqueue(4);
		
		Integer[] tablaEsperada = {3,4};
		Integer[] tablaActual = cola.getTabla();
		
		assertArrayEquals(tablaEsperada, tablaActual);
	}
	
	@Test
	void testFirst() {
		Integer resultado = cola.first();
		Integer resultadoEsperado = null;
		
		assertEquals(resultadoEsperado, resultado);
	
		//Agrego 3 elementos
		cola.enqueue(4);
		cola.enqueue(5);
		cola.enqueue(6);
		
		resultadoEsperado = 4;
		resultado = cola.first();
		
		assertEquals(resultadoEsperado, resultado);
		assertEquals(3, cola.size());
	}

}
