package es.iescamas.programacion.ej10;

import es.iescamas.programacion.ej10.interfaz.Estudiante;
import es.iescamas.programacion.ej10.interfaz.Mostrable;
import es.iescamas.programacion.ej10.interfaz.Trabajador;
import es.iescamas.programacion.ej10.modelo.Becario;

public class App {

	public static void main(String[] args) {
		   Becario becario = new Becario("Pablo");

	        // Tratar el mismo objeto como Trabajador
	        Trabajador t = becario;
	        t.trabajar();

	        // Tratar el mismo objeto como Estudiante
	        Estudiante e = becario;
	        e.estudiar();

	        // Tratar el mismo objeto como Mostrable
	        Mostrable m = becario;
	        System.out.println(m.mostrar());

	}

}
