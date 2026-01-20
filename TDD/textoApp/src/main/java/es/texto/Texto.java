package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {

	private int maxLongitud;
	private String contenido;
	
	public Texto(int maxLongitud) {
		if(maxLongitud<=0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		this.maxLongitud = maxLongitud;
		this.contenido = "";
	}


	public Texto(String contenido, int maxLongitud) {
		if(maxLongitud<=0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		if(contenido!=null && contenido.length()>maxLongitud)
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		if(contenido == null)
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		
	
		this.contenido = contenido;
		this.maxLongitud = maxLongitud;
	}


	public String getContenido() {
		return contenido;
	}


	public int longitud() {
		if(contenido == null) {
			throw new NullPointerException("No tiene longitud un texto null");
		}
		return contenido.length();
	}


	public boolean anadirFinal(char c) {
	
		/*contenido = contenido + c;
		return true;*/
		if(contenido.length()<maxLongitud) {
			StringBuilder sb = new StringBuilder(contenido);
			sb.append(c);
			contenido = sb.toString();
			return true;
		}else {
			return false;
		}
		
		
	}

	public boolean anadirFinal(String cadena) {
		if(cadena == null)
			throw new IllegalArgumentException("cadena no puede ser null");
		
		if(cadena.length()+contenido.length()<=maxLongitud) {
			contenido = contenido + cadena;
			return true;
		}else {
			return false;
		}
	}
	public boolean anadirInicio(char c) {
		StringBuilder sb = new StringBuilder();
		if(contenido.length()<maxLongitud) {
			//contenido = c + contenido;
			sb.append(c);
			sb.append(contenido);
			contenido = sb.toString();
	
			return true;
		}else {
			return false;
		}
		
	}


	public boolean anadirInicio(String cadena) {
		if(cadena == null)
			throw new IllegalArgumentException("cadena no puede ser null");
		
		if(this.longitud() + cadena.length() > this.maxLongitud) 
			return false;
		
	//	this.contenido = cadena + contenido;
		StringBuilder sb = new StringBuilder();
		sb.append(cadena);
		sb.append(contenido);
		contenido = sb.toString();
		return true;
	}


	@Override
	public String toString() {
		return "Texto [maxLongitud=" + maxLongitud + ", contenido=" + contenido + "]";
	}


	public int contarVocales() {
		// TODO Auto-generated method stub
		return 0;
	}




}
