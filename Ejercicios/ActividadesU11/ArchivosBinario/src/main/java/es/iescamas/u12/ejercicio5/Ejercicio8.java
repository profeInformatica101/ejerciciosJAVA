package es.iescamas.u12.ejercicio5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**Simula un carrito:

    Productos con nombre y precio
    Lista de productos
    Total de compra
*/
public class Ejercicio8 {
	public static void main(String[] args) {
		
		Set<Producto> productos = new HashSet<Producto>();
		Map<Producto, Integer> carrito = new HashMap<Producto, Integer>();

        // Crear productos
        Producto pan = new Producto("Pan", 1.0);
        Producto leche = new Producto("Leche", 1.5);
        Producto huevos = new Producto("Huevos", 2.5);

        // Añadir al catálogo
        productos.add(pan);
        productos.add(leche);
        productos.add(huevos);

        // Añadir al carrito
        carrito.put(pan, 2);
        carrito.put(leche, 1);
        carrito.put(huevos, 3);

        // Calcular total
        double total = 0;

        System.out.println("Carrito:");
        for (Map.Entry<Producto, Integer> entry : carrito.entrySet()) {
            Producto p = entry.getKey();
            int cantidad = entry.getValue();
            double subtotal = p.getPrecio() * cantidad;

            System.out.println(p.getNombre() + " x" + cantidad + " = " + subtotal);
            total += subtotal;
        }

        System.out.println("Total: " + total);
		
		
		
	}
	
	public static class Producto{
		private String nombre;
		private double precio;
		
		public Producto(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Producto)) return false;
            Producto p = (Producto) o;
            return nombre.equals(p.nombre);
        }

        @Override
        public int hashCode() {
            return nombre.hashCode();
        }
		
	}
}
