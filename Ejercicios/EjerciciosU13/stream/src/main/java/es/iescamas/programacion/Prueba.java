package es.iescamas.programacion;

import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1,2,4,5, 20, 123);
		numeros.forEach(System.out::println);

		List<Integer> mayores = numeros.stream().filter(n -> n>10).toList();
		System.out.println(mayores);
	}

}
