package es.tabla;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ejercicio5();
    }
    public static void ejercicio1() {
    	 System.out.println( "Hello World!" );
         int[] numeros = {1,2,3,4,5};
         ArrayApp app = new ArrayApp();
         int[] num_invertidos = app.invertirArray(numeros);
         System.out.println(Arrays.toString(num_invertidos));
    }
    public static void ejercicio2() {
    	int[] numeros = {2,3,0,0,0};
        ArrayApp app = new ArrayApp();
        double total = app.mediaPositivos(numeros);
        System.out.println(total);
    }
    
    public static void ejercicio3() {
    	int[] numeros = {10, 20, 30};
        ArrayApp app = new ArrayApp();
         int[] nums = app.borrarElemento(numeros, 1);
        System.out.println(Arrays.toString(nums));
      }
    public static void ejercicio4() {
    	 int[] t = { 1, 2, 3, 4, 5 };
    	 ArrayApp app = new ArrayApp();
    	 int[][] res = app.separarParesImpares(t);
    	 System.out.println(Arrays.deepToString(res));
    }
    public static void ejercicio5(){
    	 int[][] m = {
                 { 1, 1, 1, 1 },
                 { 2, 0, 1, 1 },
                 { 0, 2, 1, 1 },
                 { 1, 1, 1, 1 }
         };
    	 
    	 System.out.println("fila 1:" + Arrays.toString(m[0]));
    	 System.out.println("fila 2:" +Arrays.toString(m[1]));
    }
    
    
    private static int[] columna( int[][] m, int pos) {
    	int [] columna = new int[m.length];
    	for(int i =0; i<m.length; i++) {
    		columna[i] = m[pos][i];
    	}
    	return columna;
    }
}
