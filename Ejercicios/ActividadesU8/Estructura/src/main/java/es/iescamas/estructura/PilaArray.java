package es.iescamas.estructura;



public class PilaArray extends ListaArray {

	public PilaArray() {
		super();
	}

	public boolean isEmpty() {
		return super.size() == 0;
	}

	public void push(Integer n) {
		if(n != null)
			super.addFinal(n);
	}

	public Integer pop() {
		if(isEmpty()) {
			return null;
		}else {
			return super.remove(super.size()-1);
		}
		
	}

	public Integer peek() {
		if(isEmpty()) {
			return null;
		}else {
			return super.get(super.size()-1);
		}
	}
}
