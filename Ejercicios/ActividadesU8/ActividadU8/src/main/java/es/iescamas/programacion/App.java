package es.iescamas.programacion;

import es.iescamas.programacion.hora.Hora;
import es.iescamas.programacion.hora.Hora12;
import es.iescamas.programacion.hora.Periodo;
import es.iescamas.programacion.instrumentos.Instrumento;
import es.iescamas.programacion.instrumentos.Piano;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Instrumento instr = new Piano("Teest");
    	if(instr instanceof Piano) {
    		
    	}
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
