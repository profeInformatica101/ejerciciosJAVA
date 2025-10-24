package com;
/**
 * Diseñar la función calculadora() a la que se le pasan dos enteros (operandos) y la operación a realizar: 1 suma, 2 resta, 3 multiplicación, 4 división. 
 * La función devolverá un número real como resultado.
 */
public class Ejercicio12 {
	public static void main(String [] argumentos) throws Exception {
		System.out.println(calculadora(3, 2, 1));
		System.out.println(calculadora(3, 2, 2));
		System.out.println(calculadora(3, 2, 3));
		System.out.println(calculadora(3, 2, 4));
	//	System.out.println(calculadora(3, 0, 4));
		System.out.println(calculadora(3, 1, 6));
	}
	
	/**
	 * Función calculadora que devuelve la operación
	 * @param num1
	 * @param num2
	 * @param operacion
	 * @return
	 * @throws Exception
	 */
	public static double calculadora(int num1, int num2, int operacion) throws Exception {
		
		double resultado = 0.0;
		
		switch (operacion) {
		case 1: //suma
			resultado = num1 + num2;
			break;
		case 2: //resta
			resultado = num1 - num2;
			break;
		case 3: // multiplicacion
			resultado = num1 * num2;
			break;
		case 4:
			if(num2 != 0) {
				resultado = (double)num1 / num2;
			}else {
				throw new Exception("No se puede dividir por 0");
			}
			break;
		default:
			throw new Exception("No existe la operación indicada");
		}
		
		return resultado;
		
	}

}
