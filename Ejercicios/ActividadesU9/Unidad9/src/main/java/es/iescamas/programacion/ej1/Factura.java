package es.iescamas.programacion.ej1;

public class Factura implements Imprimible{
	private int id;
	private String cliente;
	private double importe;
	
	public Factura(int id, String cliente, double importe) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.importe = importe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public String imprimir() {
		return toString();
	}
	@Override
	public String toString() {
		return "Factura [id=" + id + ", cliente=" + cliente + ", importe=" + importe + "]";
	}
	
	
	
	
}
