package es.iescamas.market;

import es.iescamas.market.interfaces.Descuentable;

public class Producto implements Descuentable {

	public Producto(String sku, String nombre, String categoria, double precio, double rating, int stock, int ventas,
			double porcentajeDescuento, double pesoKg) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPorcentajeDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
}
