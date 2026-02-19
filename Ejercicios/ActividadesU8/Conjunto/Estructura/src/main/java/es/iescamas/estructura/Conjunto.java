package es.iescamas.estructura;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Conjunto extends ConjuntoArray{
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
		Objects.requireNonNull(otro, "No puede ser nulo");
		
		for(int i=0; i<otro.numeroElementos(); i++) {
			this.insertar(otro.get(i));
			
		}
	}
	
	public boolean elminarElemento(Integer n) {
		return super.removeValue(n);
	}
	public void eliminarTodos(Conjunto otro) {
		for(int i=0; i<otro.numeroElementos(); i++) {
			//Traernos el elemento de la posición i
			int n = otro.get(i);
			super.removeValue(n);
		}
	}
	public boolean pertenece(Integer n) {
		return super.contains(n);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for(int i=0; i<size(); i++) {
			sb.append(get(i));
			if(i < size()-1) {
				sb.append(", ");
			}
		}//finalFor
		sb.append("}");
		return sb.toString();
	}
	
	public int minimo() {
		if(numeroElementos() == 0)
			throw new NoSuchElementException("Conjunto vacío");
		
		int min = super.get(0);
		for(int i=1; i<numeroElementos(); i++) {
			if(super.get(i) < min) {
				min = get(i);
			}
		}
		return min;
	}

	public int maximo() {
		if(numeroElementos() == 0)
			throw new NoSuchElementException("Conjunto vacío");
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<numeroElementos(); i++) {
			if(get(i) > max) {
				max = get(i);
			}
		}
		return max;
	}

	public Double media() {
		Double media=0.0;
		for(int i=0; i<numeroElementos(); i++) {
			media += get(i);
		}
		return media/numeroElementos();
	}
}
