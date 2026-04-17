package com.titanic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.titanic.modelo.Pasajero;

public class Main {

	public static void main(String[] args) {
		TitanicFileService service = new TitanicFileService();
		List<Pasajero> pasajeros = service.cargarPasajeros();
		System.out.println(pasajeros.size());
		
		//Mujeres que sobrevivieron
		List<Pasajero> mujeres = pasajeros.stream().filter(p-> p.esMujer()).filter(p-> p.sobrevivio()).collect(Collectors.toList());
		//Nombre de Mujeres que sobrevivieron
		List<String> nombres_mujeres = pasajeros.stream().filter(p-> p.esMujer()).filter(p-> p.sobrevivio()).map(p-> p.getName()).collect(Collectors.toList());
		
		System.out.println("Total mujers sobrevivientes: " + mujeres.size());
		System.out.println(nombres_mujeres);
		
		
		// Group By
		Map<Integer, Double> edadPromedioClase = pasajeros.stream().filter(p-> p.getAge()!=null).collect(Collectors.groupingBy(Pasajero::getPclass, Collectors.averagingDouble(Pasajero::getAge)));
		System.out.println("Edad promedio por clase: " + edadPromedioClase);
		// Resultado esperado: 1ª clase ~38, 2ª clase ~30, 3ª clase ~25
	}

}
