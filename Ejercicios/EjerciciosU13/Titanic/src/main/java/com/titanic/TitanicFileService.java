package com.titanic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.titanic.modelo.Pasajero;

public class TitanicFileService {

	static final String PATH = "resources/titanic.csv";
	
	public List<Pasajero> cargarPasajeros(){
		List<Pasajero> pasajeros;
		try {
			pasajeros = abrirArchivo(PATH);
		} catch (FileNotFoundException e) {
			return List.of();
		} catch (IOException e) {
			return List.of();
		}
		return pasajeros;
	}

	private List<Pasajero> abrirArchivo(String path) throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Pasajero> pasajeros = br.lines().skip(1).map(linea-> parseLine(linea)).collect(Collectors.toList());
			return pasajeros;
		}
		
	}

	private Pasajero parseLine(String line)  {
	    // Mantiene TODOS los campos vacíos, incluso al final
	    String[] f = line.split(",", -1);
	    
	    // Limpiar comillas del nombre si existen
	    String name = getValue(f, 4);
	    if (name.startsWith("\"") && name.endsWith("\"")) {
	        name = name.substring(1, name.length() - 1);
	    }
	    
	    return new Pasajero(
	        parseInt(f, 0, 0),           // passengerId
	        parseInt(f, 1, 0),           // survived
	        parseInt(f, 2, 0),           // pclass
	        name.replace("\"", ""),                         // name
	        getValue(f, 3),
	        getValue(f, 5),              // sex
	        parseDouble(f, 6, null),     // age (nullable)
	        parseInt(f, 6, 0),           // sibSp
	        parseInt(f, 7, 0),           // parch
	        getValue(f, 8),              // ticket
	        parseDouble(f, 9, 0.0),      // fare
	        getValue(f, 10),             // cabin
	        getValueOrDefault(f, 11, "U") // embarked
	    );
	}
	private int parseInt(String[] arr, int index, int defaultValue) {
	    try {
	        if (arr.length > index && arr[index] != null && !arr[index].trim().isEmpty()) {
	            return Integer.parseInt(arr[index].trim());
	        }
	    } catch (NumberFormatException e) {}
	    return defaultValue;
	}

	private Double parseDouble(String[] arr, int index, Double defaultValue) {
	    try {
	        if (arr.length > index && arr[index] != null && !arr[index].trim().isEmpty()) {
	            return Double.parseDouble(arr[index].trim());
	        }
	    } catch (NumberFormatException e) {}
	    return defaultValue;
	}

	private String getValue(String[] arr, int index) {
	    if (arr.length > index && arr[index] != null) {
	        return arr[index].trim();
	    }
	    return "";
	}

	private String getValueOrDefault(String[] arr, int index, String defaultValue) {
	    String value = getValue(arr, index);
	    return value.isEmpty() ? defaultValue : value;
	}
}
