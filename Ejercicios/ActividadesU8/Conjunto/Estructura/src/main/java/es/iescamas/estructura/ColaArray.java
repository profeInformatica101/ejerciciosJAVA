package es.iescamas.estructura;

public class ColaArray extends ListaArray {

	public ColaArray() {
		super();
	}

	public void enqueue(Integer n) {
		if(n != null)
			super.addFinal(n);
	}
	public Integer dequeue() {
		if(! isEmpty()) {
			return super.remove(0);
		}else
			return null;
	}
	public boolean isEmpty() {
		return super.size() == 0;
	}

	public Integer first() {
		 return this.isEmpty() ? null : super.get(0);
	}

	
	
}
