package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConjuntoTest {
	private Conjunto c1, c2;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Conjunto();
		
		c2 = new Conjunto();
		c2.add(1);
		c2.add(2);
		c2.add(3);
	}

	@Test
	@DisplayName("Prueba de agregar elemento")
	void testAgregarElemento() {
		int totalEsperado = 0;
		int total = c1.numeroElementos();
		
		// Compruebo que el conjunto al inicio este vacio
		assertEquals(totalEsperado, total);
		
		c1.insertar(3);
		c1.insertar(5);
		
		totalEsperado = 2;
		total = c1.numeroElementos();
		// Compruebo que el conjunto al inicio este vacio
		assertEquals(totalEsperado, total);
	}
	

	@Test
	void testPruebaInsertarOtroConjunto() {
		Conjunto conjuntoEsperado = new Conjunto();
		conjuntoEsperado.insertar(1);
		conjuntoEsperado.insertar(2);
		conjuntoEsperado.insertar(3);
		conjuntoEsperado.insertar(5);
		
		
		//Acciones
		c1.insertar(5);
		c2.anadirElementosDe(c1);
		
		
		assertArrayEquals(conjuntoEsperado.getTabla(), c2.getTabla());
	}

}
