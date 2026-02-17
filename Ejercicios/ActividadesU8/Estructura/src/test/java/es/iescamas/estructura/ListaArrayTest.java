package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaArrayTest {

	private ListaArray lista;
	
	@BeforeEach
	void setUp() throws Exception {
		lista = new ListaArray();
	}

	@Test
	void testConstructor() {
		int resultadoEsperado = 0;
		int resultado = lista.size();
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	void testAddFinal() {
		Integer[] resultadoEsperado = {1};
		lista.addFinal(1);
		Integer[] resultado = lista.getTabla();	
		assertArrayEquals(resultadoEsperado, resultado);
		
		lista.addFinal(2);
		resultadoEsperado = new Integer[] {1,2};
		assertArrayEquals(resultadoEsperado, lista.getTabla());
	}
	
	@Test
	void testGetIndex() {
		
		// Obetner elementos de una tabla vacia
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->lista.get(0));
		String mensajeEsperado = "Fuera de rango";
		String mensaje = ex.getMessage().toString();
		assertEquals(mensajeEsperado, mensaje);
		
		// Obtener index - 1
		ex = assertThrows(IllegalArgumentException.class, ()->lista.get(-1));
		mensaje = ex.getMessage().toString();
		assertEquals(mensajeEsperado, mensaje);
		
		lista.addFinal(1);
		Integer[] tablaEsperada = {1};
		int numElementoEsperado = 1;
		
		assertArrayEquals(tablaEsperada, lista.getTabla());
		assertEquals(numElementoEsperado, lista.size());
	}
	
	@Test
	void testRemove() {
		// [5 , 8]
		lista.addFinal(5);
		lista.addFinal(8);
		// [8]
		lista.remove(0);
		Integer[] resultadoEsperado = {8,null};
		Integer[] resultado = lista.getTabla();
		int numElementosEsperado = 1;
		int numElementos = lista.size();
		
		assertArrayEquals(resultadoEsperado, resultado);
		assertEquals(numElementosEsperado, numElementos);
	
		lista.addFinal(9);
		resultadoEsperado = new Integer[] {8,9};
		numElementosEsperado = 2;
		
		assertArrayEquals(resultadoEsperado, lista.getTabla());
		assertEquals(numElementosEsperado, lista.size());
	
		lista.addFinal(6);
		lista.addFinal(5);
		lista.addFinal(4);

		resultadoEsperado = new Integer[] {8,9,6,5,4};
		assertArrayEquals(resultadoEsperado, lista.getTabla());
		
		int retornaRemoveEsperado = 9;
		int retornaRemove = lista.remove(1);
		
		resultadoEsperado = new Integer[] {8,6,5,4,null};
		assertEquals(retornaRemoveEsperado, retornaRemove);
		assertArrayEquals(resultadoEsperado, lista.getTabla());
		
		lista.addFinal(6);
		resultadoEsperado = new Integer[] {8,6,5,4,6};
		assertArrayEquals(resultadoEsperado, lista.getTabla());
	
		lista.addFinal(4);
		resultadoEsperado = new Integer[] {8,6,5,4,6,4};
		assertArrayEquals(resultadoEsperado, lista.getTabla());
		
	}
	
	@Test
	void testIndexOf() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->lista.indexOf(null));
		String mensajeEsperado = "No puede ser null";
		String mensaje = exception.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
		
		lista.addFinal(5);
		lista.addFinal(6);
		lista.addFinal(13);
		
		int resultadoEspero = 1;
		int resultado = lista.indexOf(6);
		
		assertEquals(resultadoEspero, resultado);
	}

}
