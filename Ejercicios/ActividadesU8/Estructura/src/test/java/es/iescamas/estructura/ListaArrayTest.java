package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ListaArrayTest {

	private ListaArray lista ;
	
	@BeforeEach
    void setUp() {
		lista = new ListaArray();
    }
	
	@Test
	void testListaAgregarAlfinal() {
		Integer[] resultadoEsperado = new Integer[]{1};
		lista.addFinal(1);
		Integer[] resultado = lista.getTabla();
		assertArrayEquals(resultadoEsperado, resultado);
		 lista.addFinal(2);
		 resultado = lista.getTabla();
		assertArrayEquals((new Integer[]{1,2}), resultado);
	}
	
	@Test
	void testConstructor() {
		Integer[] resultadoEsperado = {};
		Integer[] resultado = lista.getTabla();
		assertArrayEquals(resultadoEsperado, resultado);
	}
	
}
