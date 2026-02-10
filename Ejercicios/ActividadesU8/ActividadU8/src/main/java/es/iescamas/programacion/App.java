package es.iescamas.programacion;

import es.iescamas.programacion.hora.Hora;
import es.iescamas.programacion.hora.Hora12;
import es.iescamas.programacion.hora.Periodo;
import es.iescamas.programacion.instrumentos.Campana;
import es.iescamas.programacion.instrumentos.Instrumento;
import es.iescamas.programacion.instrumentos.Nota;
import es.iescamas.programacion.instrumentos.Piano;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Instrumento[] banda = new Instrumento[3];
    	Instrumento i1 = new Campana();
    	i1.add(Nota.MI);
    	i1.add(Nota.FA);
 
    	banda[0] = i1;
    	
    	Instrumento i2 = new Piano();
    	i2.add(Nota.LA);
    	i2.add(Nota.RE);
    	
    	banda[1] = i2;
    	
    	Instrumento i3 = new Campana();
    	i3.add(Nota.LA);
    	i3.add(Nota.FA);
    	
    	banda[2] = i3;
    			
    	for(Instrumento i : banda) {
    		if(i instanceof Campana) {
    			i.interpretar();
    		}
    		
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
