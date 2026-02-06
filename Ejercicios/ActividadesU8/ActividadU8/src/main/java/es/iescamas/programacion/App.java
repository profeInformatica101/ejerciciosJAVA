package es.iescamas.programacion;

import es.iescamas.programacion.hora.Hora;
import es.iescamas.programacion.hora.Hora12;
import es.iescamas.programacion.hora.Periodo;
import es.iescamas.programacion.instrumentos.Instrumento;
import es.iescamas.programacion.instrumentos.Notas;
import es.iescamas.programacion.instrumentos.Piano;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    
    	EjemploTablaNotas();
    	
    }

	private static void EjemploTablaNotas() {
		Notas[] notas = {Notas.DO, Notas.SOL, Notas.DO};
		Notas[] notas_v2 = new Notas[300];
		notas_v2[0] = Notas.DO;
		notas_v2[1] = Notas.DO;
		
	}

	private static void EjemploHora12() {
		Hora12 hora12 = new Hora12(12,59, Periodo.AM);
		System.out.println(hora12.toString());
		hora12.inc();
		System.out.println(hora12.toString());
	}

	private static void EjemploHora() {
		Hora hora = new Hora(00, 00);
		System.out.println(hora.toString());
	}
}
