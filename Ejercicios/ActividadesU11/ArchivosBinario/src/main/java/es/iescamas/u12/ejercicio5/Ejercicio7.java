package es.iescamas.u12.ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio7 {

	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<>(List.of(
				new Alumno("José", 3),
				new Alumno("Maria", 10),
				new Alumno("Juan", 5),
				new Alumno("Rosario", 7)
				));
		
		alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());
		System.out.println(alumnos);
	}
		
	
	public static class Alumno{
		private String nombre;
		private Integer nota;
		
		public Alumno(String nombre, Integer nota) {
			this.nombre = nombre;
			this.nota = nota;
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Integer getNota() {
			return nota;
		}
		public void setNota(Integer nota) {
			this.nota = nota;
		}


		@Override
		public String toString() {
			return "[nombre=" + nombre + ", nota=" + nota + "]";
		}
		
		
	}
}
