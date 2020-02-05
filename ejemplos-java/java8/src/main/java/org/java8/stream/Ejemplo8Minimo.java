package org.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejemplo8Minimo {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 0);
		Optional<Integer> maximo = lista.stream().reduce(Integer::min);
		System.out.println(maximo.get());
	}
}
