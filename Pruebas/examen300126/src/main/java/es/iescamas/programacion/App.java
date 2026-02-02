package es.iescamas.programacion;

import java.util.Arrays;

import es.iescamas.programacion.ej1.CalculoMatriz;
import es.iescamas.programacion.ej2.AyudaCaracteres;
import es.iescamas.programacion.ej3.Diagonal;
import es.iescamas.programacion.ej4.OrdenAlfabetico;
import es.iescamas.programacion.ej5.GestorUsuarios;
import es.iescamas.programacion.ej5.Usuario;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Inicio");
        	//Ejercicio1();
        	//Ejercicio2();
        	//Ejercicio3();
        	//Ejercicio4();
        	Ejercicio5();
        System.out.println("Fin");
    }
    
    private static void Ejercicio5() {
		// TODO Auto-generated method stub
    	Usuario[] usuarios = {
    			  new Usuario("Ana", 20, "ana@gmail.com", "Sevilla"),
    			  null,
    			  new Usuario("Luis", 18, "luis@outlook.com", "Camas")
    			};
    	
    	System.out.println(generarInforme(usuarios));
		
	}

	private static String generarInforme(Usuario[] usuarios) {
		
		return GestorUsuarios.generarInforme(usuarios);
	}

	private static void Ejercicio4() {
		String[] palabras = {"Zorro", "Abeja", "Perro"};
		OrdenAlfabetico oa = new OrdenAlfabetico(palabras);
		oa.ordenar();
		System.out.println(Arrays.toString(oa.getPalabras()));
		
	}

	private static void Ejercicio3() {
		int[][] matriz = {{0,0,1}, {0,1,0}, {1,0,0}};	
		
		Diagonal diagonal = new Diagonal(matriz);
		int total = diagonal.sumaDiagonal();
		
		System.out.println("Total: " + total);
	}

	private static void Ejercicio2() {
    	char[] pal1 = {'H','o','l','a'};
    	char[] pal2 = {'A','d','i','o','s'};
    	
    	char[] pal3 =AyudaCaracteres.mezcla(pal1, pal2);
    	System.out.println(Arrays.toString(pal3));
		
	}

	public static void Ejercicio1() {
    	int [][] matrizConNulo = {{1},null,{2,3}};
    	int [][] matrizNula =  null;
    	int [][] matrizDistintoTam = {{1,2,3}, {4,5}, {7,8,9}};
    	int [][] matrizValida = {{1,2,3}, {4,5,6}, {7,8,9}};
    		
    	
    	boolean esValida =  CalculoMatriz.esValido(matrizConNulo);
    	System.out.println("matrizConNulo: " + esValida);
    	
    	 esValida =  CalculoMatriz.esValido(matrizNula);
    	System.out.println("matrizNula: " + esValida);
    	
    	 esValida =  CalculoMatriz.esValido(matrizDistintoTam);
     	System.out.println("matrizDistintoTam: " + esValida);
     	

   	 esValida =  CalculoMatriz.esValido(matrizValida);
    	System.out.println("matrizValida: " + esValida);
    	
    	int[][] matrizA = {{1,1,1}, {1,1,1}, {1,1,1}};
    	int[][] matrizB = {{2,2,2}, {2,2,2}, {2,2,2}};
    	
    	CalculoMatriz cm = new CalculoMatriz(matrizA, matrizB);
    	int[][] matrizC = cm.sumar();
    	
    	System.out.println(Arrays.deepToString(matrizC));
    	
    	
    }
}
