package es.iescamas.estructura;

public class ConjuntoArray extends ListaArray{
	public ConjuntoArray() {
		super();
	}
	
	public boolean contains(Integer n) {
		return (super.indexOf(n) != -1);
	}
	
	public boolean add(Integer n) {
		if (n == null)
	         throw new IllegalArgumentException("No puede ser null");
	      
		if (!this.contains(n)) {
	         super.addFinal(n);
	         return true;
	      } else {
	         return false;
	      }
	}
	public boolean removeValue(Integer n) {
		 if (n == null) 
	         throw new IllegalArgumentException("No puede ser null");
	       
		if(contains(n)) {
			int index = super.indexOf(n);
			super.remove(index);
			return true;
		}
		return false;
	}
	
}
