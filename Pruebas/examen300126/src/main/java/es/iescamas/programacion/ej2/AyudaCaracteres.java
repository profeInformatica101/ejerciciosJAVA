package es.iescamas.programacion.ej2;

public class AyudaCaracteres {

	public static char[] mezcla(char[] palabraA, char[] palabraB) {
		if(palabraA == null || palabraB == null)
			throw new IllegalArgumentException("No pueden ser null");
		
		int tamTotal = palabraA.length + palabraB.length;
		char[] resultado = new char[tamTotal];
		
		int indicePA = 0, indicePB=0, indiceRES = 0;
		
		while(indiceRES < tamTotal) {
			if(indicePA < palabraA.length && palabraA[indicePA] != '\0') {
				resultado[indiceRES] = palabraA[indicePA];
				indicePA++;
				indiceRES++;
			}
			if(indicePB < palabraB.length && palabraB[indicePB] != '\0') {
				resultado[indiceRES] = palabraB[indicePB];
				indicePB++;
				indiceRES++;
			}
		}
		//['H','A','o','d','l','i','a','o','s'] 
		String resultado_string = String.valueOf(resultado).toLowerCase();
		resultado = resultado_string.toCharArray();
		return resultado;
	}
	
}
