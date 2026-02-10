package es.iescamas.estructura;

public class ListaArray {

	private Integer[] tabla;
	private int numElementos;
	
	public ListaArray() {
		super();
		tabla = new Integer[0];
		this.numElementos = 0;
	}
	
	public int size() {
		return numElementos;
	}
	public void addFinal(Integer n) {
		if(numElementos < tabla.length) {
			
			tabla[numElementos] = n;
			
		}else {
			
		}
	}
	
}
