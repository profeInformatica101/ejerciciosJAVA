package es.iescamas.estructura;

public class Conjunto extends ConjuntoArray {

	public Conjunto() {
		super();
	}
	
	public int numeroElementos() {
		return super.size();
	}
	
	public boolean insertar(Integer n) {
		return super.add(n);
	}
	
	public void anadirElementosDe(Conjunto otro) {
		for(int i=0; i<otro.numeroElementos(); i++) {
			Integer elemento = otro.get(i);
			if(!super.contains(elemento)) {
				insertar(elemento);
			}
		}
	}
}
