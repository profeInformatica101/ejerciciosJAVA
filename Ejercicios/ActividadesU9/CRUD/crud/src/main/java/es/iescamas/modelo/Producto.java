package es.iescamas.modelo;

import java.time.LocalDate;

import es.iescamas.interfaz.Identificable;
import es.iescamas.interfaz.Mostrable;

public class Producto implements Identificable, Mostrable {

    private static int contadorIds = 1;

    private String id;
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private LocalDate fechaCaducidad;

    public Producto(String nombre, double precio, CategoriaProducto categoria, LocalDate fechaCaducidad) {
        this.id = generarId();
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.fechaCaducidad = fechaCaducidad;
    }

    private String generarId() {
        String idGenerado = String.format("P%03d", contadorIds);
        contadorIds++;
        return idGenerado;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Producto [id=" + id
                + ", nombre=" + nombre
                + ", precio=" + precio
                + ", categoria=" + categoria
                + ", fechaCaducidad=" + fechaCaducidad + "]";
    }
}