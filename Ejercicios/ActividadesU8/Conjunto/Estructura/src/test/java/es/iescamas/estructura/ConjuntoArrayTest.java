package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConjuntoArrayTest {

	private ConjuntoArray conjunto;
	
	
	@BeforeEach
	void setUp() throws Exception {
		conjunto = new ConjuntoArray();
	}

	@Test
	void test() {
		assertFalse(conjunto.contains(3));
		assertTrue(conjunto.add(3));
		assertTrue(conjunto.contains(3));
		assertTrue(conjunto.add(5));
		assertFalse(conjunto.add(3));
		
		assertTrue(conjunto.removeValue(3));
		assertFalse(conjunto.removeValue(3));
		assertFalse(conjunto.contains(3));
	}

}
