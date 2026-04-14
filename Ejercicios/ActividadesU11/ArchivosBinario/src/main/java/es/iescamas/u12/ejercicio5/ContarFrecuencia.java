package es.iescamas.u12.ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ContarFrecuencia {

    static final String FILE = "texto.txt";
    static final Integer TOTAL_MAX = 30;

    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] tabla_palabras = linea.toUpperCase().split("\\s+");

                for (String palabra : tabla_palabras) {

                    palabra = limpiar(palabra);

                    if (palabra.isEmpty()) continue;
                    if (esNumero(palabra)) continue;

                    if (preposiciones.contains(palabra)) continue;
                    if (conjunciones.contains(palabra)) continue;
                    if (articulos.contains(palabra)) continue;
                    if (pronombres.contains(palabra)) continue;

                    mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
                }
            }
          
            List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());
            
            lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            for (int i = 0; i < TOTAL_MAX && i < lista.size(); i++) {
                Map.Entry<String, Integer> e = lista.get(i);
                System.out.println(e.getKey() + " -> " + e.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean esNumero(String s) {
        if (s == null || s.trim().isEmpty()) return false;

        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String limpiar(String palabra) {

        if (palabra == null) return "";

        return palabra
            .replace("Á","A")
            .replace("É","E")
            .replace("Í","I")
            .replace("Ó","O")
            .replace("Ú","U")
            .replaceAll("[^A-Z]", ""); // elimina signos de puntuación
    }

    static final Set<String> preposiciones = Set.of(
        "A", "ANTE", "BAJO", "CABE", "CON", "CONTRA", "DE", "DESDE",
        "DURANTE", "EN", "ENTRE", "HASTA", "HACIA", "MIENTRAS",
        "PARA", "POR", "SEGÚN", "SIN", "SO", "SOBRE", "TRAS",
        "VERSUS", "VÍA"
    );

    static final Set<String> conjunciones = Set.of(
        "Y", "E", "NI",
        "O", "U",
        "PERO", "SINO", "SIN", "EMBARGO", "AUNQUE",
        "BIEN", "YA", "SEA",
        "QUE", "SI",
        "PORQUE", "PUES",
        "CUANDO", "MIENTRAS",
        "COMO",
        "PARA"
    );

    static final Set<String> articulos = Set.of(
        "EL", "LA", "LOS", "LAS",
        "UN", "UNA", "UNOS", "UNAS",
        "LO", "DEL"
    );

    static final Set<String> pronombres = Set.of(
        "YO", "TÚ", "ÉL", "ELLA", "USTED",
        "NOSOTROS", "NOSOTRAS", "VOSOTROS", "VOSOTRAS",
        "ELLOS", "ELLAS", "USTEDES",
        "ME", "TE", "SE", "NOS", "OS",
        "LO", "LA", "LOS", "LAS", "LE", "LES",
        "MI", "TU", "SU", "MIS", "TUS", "SUS",
        "ESTE", "ESTA", "ESTOS", "ESTAS",
        "ESE", "ESA", "ESOS", "ESAS",
        "AQUEL", "AQUELLA", "AQUELLOS", "AQUELLAS",
        "ALGO", "ALGUIEN", "NADA", "NADIE",
        "OTRO", "OTRA", "OTROS", "OTRAS"
    );

}