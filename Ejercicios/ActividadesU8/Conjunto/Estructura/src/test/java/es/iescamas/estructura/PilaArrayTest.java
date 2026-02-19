package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArrayTest {
	
	private PilaArray pila;

	@BeforeEach
	void setUp() throws Exception {
		pila = new PilaArray();
	}

	@Test
	void testIsEmpty() {
		assertTrue(pila.isEmpty());
	}
	
	@Test
	void testPush() {
		pila.push(3); 
		
		int totalEsperado = 1;
		int total = pila.size();
		assertEquals(totalEsperado, total);
		
		pila.push(6);
		totalEsperado = 2;
		total = pila.size();
		assertEquals(totalEsperado, total);
		
		pila.push(null);
		totalEsperado = 2;
		total = pila.size();
		assertEquals(totalEsperado, total);
	
	}
	
	@Test
	void testPop() {
		pila.push(1);
		pila.push(2);
		pila.push(3);

		int resultado = pila.pop();
		int resultadoEsperado = 3;
		
		assertEquals(resultadoEsperado, resultado);
		
		resultado = pila.pop();
		resultadoEsperado = 2;
		
		assertEquals(resultadoEsperado, resultado);
		assertFalse(pila.isEmpty());
		pila.pop();
		pila.pop();
		assertTrue(pila.isEmpty());
		
	}
	
	@Test
	void testPeek() {
		pila.push(1);
		pila.push(2);
		pila.push(5);
		
		int resultado = pila.peek();
		int resultadoEsperado = 5;
		int sizeEsperado = 3;
		int size = pila.size();
		
		assertEquals(resultadoEsperado, resultado);
		assertEquals(sizeEsperado, size);
		
		pila.pop();
		resultado = pila.peek();
		resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultado);
	}

}
