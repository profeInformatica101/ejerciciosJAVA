package es.iescamas.programacion.ej1;

public class App {

	public static void main(String[] args) {
		
		Persona p = new Persona("María");
		Factura f = new Factura(0, "María", 2.0);
		Informe i = new Informe("Titulo", "Autor" , 3);
		
		Imprimible [] imprimbles = {f, i, p };

		for(Imprimible imprimible : imprimbles) {
			System.out.println(imprimible.imprimir());
		}
	}

}
