package es.iescamas.programacion.ej1;

public class Informe implements Imprimible{
	private String titulo;
	private String autor;
	private int paginas;
	
	
	
	public Informe(String titulo, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String imprimir() {
		return toString();
	}
	@Override
	public String toString() {
		return "Informe [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}
	
	
}
