package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	List<Persona> personas = new ArrayList<Persona>(List.of(new Persona("Rocio", 17, "Madrid")));
    	personas.add(new Persona("Juan", 50, "Sevilla"));
    	personas.add(new Persona("María", 23, "Sevilla"));
    	
    	List<Persona> sevillanos = personas.stream().filter(p-> p.getCiudad().equals("Sevilla")).toList();
    	
    	System.out.println(sevillanos);
    	// Solo nombres mayores de edad
    	List<String> nombres = personas.stream().filter(p->p.getEdad()>=18).map( pers -> pers.getNombre()).toList();
    	System.out.println(nombres);
    	
    	//promedio de edad
    	double edadPromedio = personas.stream().mapToInt(Persona::getEdad).average().getAsDouble();
    	System.out.println();
    }
    public static void pruebaStream() {
    	/**
    	 * Filtrado
    	 */
        List<Integer> numeros = new ArrayList<>(List.of(6,7,8,9, 1,2,3,4,5,50,23,10));
        List<Integer> pares = numeros.stream()
        		.filter(n -> n % 2 ==0).toList();
        System.out.println(pares);
        List<Integer> impares = numeros.stream().filter(n -> esImpar(n)).toList();
        System.out.println(impares);
        /**
         * Mapeo 
         */
        List<String> nombres = List.of("ana", "juan", "pedro", "pepe");
        List<String> mayusculas = nombres.stream().filter(c -> c.startsWith("pe")).map(n-> n.toUpperCase()).toList();
        System.out.println(mayusculas);
        
        List<String> capitalizadas = nombres.stream()
        	    .map(n -> n.substring(0,1).toUpperCase() +  n.substring(1))
        	    .toList();
    
        System.out.println(capitalizadas);
        
        List<Integer> cuadrado_numeros = numeros.stream().filter(n->n%2==0).map(num-> num * num).toList();
        System.out.println(cuadrado_numeros);
        
        /** sum
         * 
         */
        Integer suma = numeros.stream().reduce(0, Integer::sum);
        System.out.println(suma);
        
        Integer mult = numeros.stream().reduce(1, (x,y)-> x*y);
        System.out.println(mult);
        
     // Máximo sin usar max()
        int maximo = numeros.stream()
            .reduce(Integer::max).get();
           
        System.out.println(maximo);
        
        // Ordenar --> Limitamos a 3 elementos --> a lista
        List<Integer> top3 = numeros.stream().sorted().limit(4).toList();
        System.out.println(top3);
        List<Integer> top3down = numeros.stream().sorted(Collections.reverseOrder()).limit(4).toList();
        System.out.println(top3down);
    }
    public static boolean esImpar(Integer n) {
    	return n % 2 != 0;
    }
}
