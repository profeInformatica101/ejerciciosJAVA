package com;

public class Main {
	public static void main(String [] args) {
		Calculadora calc = new Calculadora(3,2);
		double num = calc.dividir();
		System.out.println(num);
	}
}
