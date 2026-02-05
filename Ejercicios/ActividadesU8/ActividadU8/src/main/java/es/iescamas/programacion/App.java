package es.iescamas.programacion;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	/*DiaDeLaSemana dia = DiaDeLaSemana.LUNES;
    	System.out.println(dia.toString());
    	dia = DiaDeLaSemana.VIERNES;
    	System.out.println(dia.toString());
    	*/
    	//EjemploHora();
    	EjemploHora12();
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
