package es.iescamas.programacion.ej10.modelo;

import es.iescamas.programacion.ej10.interfaz.Estudiante;
import es.iescamas.programacion.ej10.interfaz.Mostrable;
import es.iescamas.programacion.ej10.interfaz.Trabajador;

public class Becario extends Persona implements Trabajador, Estudiante, Mostrable {

	public Becario(String nombre) {
		super(nombre);
	}

	@Override
	public void trabajar() {
        System.out.println(nombre + " está realizando tareas de apoyo en la empresa.");		
	}

	@Override
	public void estudiar() {
        System.out.println(nombre + " está estudiando y formándose.");
	}

	@Override
	public String mostrar() {
		 return "Becario{nombre='" + nombre + "'}";
	}

}
