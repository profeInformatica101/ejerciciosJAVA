package com.titanic;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

@DisplayName("TitanicFileService (TDD) - Pruebas unitarias JUnit 5")
class TitanicFileServiceTest {

    private TitanicFileService service;
    private File titanicFile;
    private File titanicColumnasFile;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        service = new TitanicFileService();
        titanicFile = getFileFromResources("titanic.csv");
        titanicColumnasFile = getFileFromResources("titanic_columnas.txt");
    }

    private File getFileFromResources(String fileName) {
        URL resource = getClass().getClassLoader().getResource(fileName);
        assertNotNull(resource, "No se encontró el recurso: " + fileName);

        try { 
            return Path.of(resource.toURI()).toFile();
        } catch (URISyntaxException e) {
            fail("No se pudo convertir el recurso a File: " + fileName);
            return null;
        }
    }

    /** 
    // -------------------------
    // 1) EXISTE ARCHIVO
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar existeArchivo(ruta) devolviendo true si el archivo existe
    // y false si la ruta no existe.
    //
    // Ejemplo:
    // existeArchivo(rutaTitanicValida) -> true
    // existeArchivo("ruta/que/no/existe.csv") -> false
    @Test
    @DisplayName("existeArchivo(ruta): devuelve true si existe y false si no existe")
    void existeArchivo_basico() {
        boolean resultado = service.existeArchivo(titanicFile.getPath());
        assertTrue(resultado, "Debe devolver true para un archivo existente");

        boolean resultado2 = service.existeArchivo("ruta/que/no/existe.csv");
        assertFalse(resultado2, "Debe devolver false si la ruta no existe");
    }

    // -------------------------
    // 2) ES CSV
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar esCsv(archivo) devolviendo true si el archivo tiene extensión .csv.
    // Si el archivo es null, debe lanzar IllegalArgumentException con el mensaje:
    // "El archivo no puede ser null"
    //
    // Ejemplo:
    // esCsv(titanic.csv) -> true
    // esCsv(datos.txt) -> false
      @Test
    @DisplayName("esCsv(archivo): devuelve true si tiene extensión .csv")
    void esCsv_basico() throws IOException {
        boolean resultado = service.esCsv(titanicFile);
        assertTrue(resultado, "Debe reconocer titanic.csv como archivo CSV");

        Path txt = tempDir.resolve("datos.txt");
        Files.writeString(txt, "hola");

        boolean resultado2 = service.esCsv(txt.toFile());
        assertFalse(resultado2, "Debe devolver false para un archivo .txt");
    }
    
    @Test
    @DisplayName("esCsv(archivo): lanza excepción si el archivo es null")
    void esCsv_null_lanzaExcepcion() {
        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, () -> service.esCsv(null));

        assertEquals("El archivo no puede ser null", ex.getMessage());
    }
  
    // -------------------------
    // 3) LEER CABECERA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar leerCabecera(archivo) devolviendo la primera línea del fichero.
    // Si el archivo no existe, debe lanzar IllegalArgumentException con el mensaje:
    // "El archivo no existe"
    //
    // Ejemplo:
    // leerCabecera(titanic.csv) -> "PassengerId,Survived,..."
    @Test
    @DisplayName("leerCabecera(archivo): devuelve la primera línea del fichero")
    void leerCabecera_basico() {
        String resultado = service.leerCabecera(titanicFile);

        assertNotNull(resultado, "La cabecera no debe ser null");
        assertTrue(resultado.contains("PassengerId"));
        assertTrue(resultado.contains("Survived"));
        assertTrue(resultado.contains("Name"));
    }
 
    @Test
    @DisplayName("leerCabecera(archivo): lanza excepción si el archivo no existe")
    void leerCabecera_archivoInexistente() {
        File inexistente = new File("no_existe.csv");

        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, () -> service.leerCabecera(inexistente));

        assertEquals("El archivo no existe", ex.getMessage());
    }

    // -------------------------
    // 4) CONTAR LÍNEAS Y PASAJEROS
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar:
    // - contarLineas(archivo): cuenta todas las líneas del archivo
    // - contarPasajeros(archivo): cuenta todas las líneas menos la cabecera
    //
    // Ejemplo con el dataset clásico:
    // contarLineas(titanic.csv) -> 892
    // contarPasajeros(titanic.csv) -> 891
    @Test
    @DisplayName("contarLineas(archivo): cuenta todas las líneas del archivo")
    void contarLineas_basico() {
        int resultado = service.contarLineas(titanicFile);
        assertEquals(892, resultado, "Debe contar 892 líneas en total");
    }

    @Test
    @DisplayName("contarPasajeros(archivo): cuenta pasajeros sin incluir cabecera")
    void contarPasajeros_basico() {
        int resultado = service.contarPasajeros(titanicFile);
        assertEquals(891, resultado, "Debe contar 891 pasajeros");
    }

    @Test
    @DisplayName("contarPasajeros(archivo): lanza excepción si el archivo es null")
    void contarPasajeros_null_lanzaExcepcion() {
        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, () -> service.contarPasajeros(null));

        assertEquals("El archivo no puede ser null", ex.getMessage());
    }

    // -------------------------
    // 5) CONTAR SUPERVIVIENTES
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar contarSupervivientes(archivo) leyendo el CSV y contando
    // cuántos pasajeros tienen Survived = 1.
    //
    // Ejemplo con el dataset clásico:
    // contarSupervivientes(titanic.csv) -> 342
    @Test
    @DisplayName("contarSupervivientes(archivo): cuenta pasajeros con Survived = 1")
    void contarSupervivientes_basico() {
        int resultado = service.contarSupervivientes(titanicFile);
        assertEquals(342, resultado, "Debe contar correctamente los supervivientes");
    }

    // -------------------------
    // 6) CONTAR POR SEXO
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar contarPorSexo(archivo, sexo):
    // - cuenta cuántos pasajeros tienen ese sexo
    // - ignora mayúsculas/minúsculas
    // - si el sexo es null, lanza IllegalArgumentException con el mensaje:
    //   "El sexo no puede ser null"
    //
    // Ejemplo:
    // contarPorSexo(titanic.csv, "male") -> 577
    // contarPorSexo(titanic.csv, "female") -> 314
    @Test
    @DisplayName("contarPorSexo(archivo, sexo): cuenta hombres y mujeres ignorando mayúsculas")
    void contarPorSexo_basico() {
        int hombres = service.contarPorSexo(titanicFile, "male");
        assertEquals(577, hombres, "Debe contar correctamente los hombres");

        int mujeres = service.contarPorSexo(titanicFile, "female");
        assertEquals(314, mujeres, "Debe contar correctamente las mujeres");

        int mujeresMayus = service.contarPorSexo(titanicFile, "FEMALE");
        assertEquals(314, mujeresMayus, "Debe ignorar mayúsculas y minúsculas");

        int desconocido = service.contarPorSexo(titanicFile, "robot");
        assertEquals(0, desconocido, "Si el sexo no existe, debe devolver 0");
    }

    @Test
    @DisplayName("contarPorSexo(archivo, sexo): lanza excepción si sexo es null")
    void contarPorSexo_null_lanzaExcepcion() {
        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class,
                        () -> service.contarPorSexo(titanicFile, null));

        assertEquals("El sexo no puede ser null", ex.getMessage());
    }

    // -------------------------
    // 7) EDAD MEDIA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar calcularEdadMedia(archivo) usando solo las edades válidas.
    //
    // Ejemplo con el dataset clásico:
    // calcularEdadMedia(titanic.csv) -> aproximadamente 29.7
    @Test
    @DisplayName("calcularEdadMedia(archivo): calcula la media de edad de los pasajeros")
    void calcularEdadMedia_basico() {
        double resultado = service.calcularEdadMedia(titanicFile);
        assertEquals(29.7, resultado, 0.2, "La media de edad debe rondar 29.7");
    }

    // -------------------------
    // 8) BUSCAR NOMBRE POR ID
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar buscarNombrePorPassengerId(archivo, id):
    // - devuelve el nombre del pasajero si existe
    // - devuelve null si no existe
    //
    // Ejemplo:
    // buscarNombrePorPassengerId(titanic.csv, 1) -> "Braund, Mr. Owen Harris"
    @Test
    @DisplayName("buscarNombrePorPassengerId(archivo, id): devuelve nombre si existe o null si no")
    void buscarNombrePorPassengerId_basico() {
        String resultado = service.buscarNombrePorPassengerId(titanicFile, 1);
        assertEquals("Braund, Mr. Owen Harris", resultado, "Debe encontrar el nombre del pasajero 1");

        String resultado2 = service.buscarNombrePorPassengerId(titanicFile, 9999);
        assertNull(resultado2, "Si el id no existe, debe devolver null");
    }

    // -------------------------
    // 9) ANEXAR LÍNEA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar anexarLinea(archivo, linea):
    // - añade una nueva línea al final del archivo
    // - si linea es null, lanza IllegalArgumentException con el mensaje:
    //   "La línea no puede ser null"
    //
    // Ejemplo:
    // anexarLinea(copia.csv, "999,1,1,...")
    @Test
    @DisplayName("anexarLinea(archivo, linea): añade una línea al final del archivo")
    void anexarLinea_basico() throws IOException {
        Path copia = tempDir.resolve("copia.csv");
        Files.copy(titanicFile.toPath(), copia);

        int lineasAntes = (int) Files.lines(copia).count();

        String nuevaLinea = "999,1,1,Profesor Example,male,30,0,0,TEST123,10.0,,S";
        service.anexarLinea(copia.toFile(), nuevaLinea);

        List<String> lineas = Files.readAllLines(copia);
        int lineasDespues = lineas.size();

        assertEquals(lineasAntes + 1, lineasDespues, "Debe añadirse una nueva línea");
        assertEquals(nuevaLinea, lineas.get(lineas.size() - 1), "La última línea debe ser la nueva");
    }

    @Test
    @DisplayName("anexarLinea(archivo, linea): lanza excepción si la línea es null")
    void anexarLinea_null_lanzaExcepcion() throws IOException {
        Path copia = tempDir.resolve("copia.csv");
        Files.copy(titanicFile.toPath(), copia);

        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class,
                        () -> service.anexarLinea(copia.toFile(), null));

        assertEquals("La línea no puede ser null", ex.getMessage());
    }

    // -------------------------
    // 10) COPIAR SUPERVIVIENTES
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar copiarSupervivientes(origen, destino):
    // - copia la cabecera
    // - copia solo los pasajeros con Survived = 1
    //
    // Ejemplo:
    // copiarSupervivientes(titanic.csv, supervivientes.csv)
    @Test
    @DisplayName("copiarSupervivientes(origen, destino): crea un CSV solo con supervivientes")
    void copiarSupervivientes_basico() throws IOException {
        File destino = tempDir.resolve("supervivientes.csv").toFile();

        service.copiarSupervivientes(titanicFile, destino);

        assertTrue(destino.exists(), "El archivo destino debe existir");

        List<String> lineas = Files.readAllLines(destino.toPath());
        assertEquals(343, lineas.size(), "Debe incluir cabecera + 342 supervivientes");
        assertTrue(lineas.get(0).contains("PassengerId"), "Debe conservar la cabecera");
    }

    @Test
    @DisplayName("copiarSupervivientes(origen, destino): el contenido debe tener solo Survived = 1")
    void copiarSupervivientes_soloSupervivientes() throws IOException {
        File destino = tempDir.resolve("supervivientes.csv").toFile();

        service.copiarSupervivientes(titanicFile, destino);

        List<String> lineas = Files.readAllLines(destino.toPath());

        for (int i = 1; i < lineas.size(); i++) {
            String linea = lineas.get(i);
            String[] partes = linea.split(",");
            assertTrue(partes.length > 1, "La línea CSV debe tener al menos dos columnas");
            assertEquals("1", partes[1], "Todas las líneas deben ser de supervivientes");
        }
    }

    // -------------------------
    // 11) LEER TITANIC_COLUMNAS.TXT
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Acceder al archivo titanic_columnas.txt desde resources y comprobar
    // que puede leerse correctamente.
    //
    // Ejemplo:
    // leer contenido y verificar que aparecen PassengerId, Survived y Embarked
    @Test
    @DisplayName("titanic_columnas.txt: debe existir y poder leerse desde resources")
    void leerArchivoColumnas_basico() throws IOException {
        assertNotNull(titanicColumnasFile, "El archivo de columnas no debe ser null");
        assertTrue(titanicColumnasFile.exists(), "El archivo de columnas debe existir");

        String contenido = Files.readString(titanicColumnasFile.toPath());

        assertNotNull(contenido, "El contenido no debe ser null");
        assertTrue(contenido.contains("PassengerId"), "Debe contener PassengerId");
        assertTrue(contenido.contains("Survived"), "Debe contener Survived");
        assertTrue(contenido.contains("Embarked"), "Debe contener Embarked");
    }
    */
}