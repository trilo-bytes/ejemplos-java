package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo8AnyMatch {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 1, 1, 2);
		if (lista.stream().anyMatch(i -> i % 2 == 0)) {
			System.out.println("Hay pares");
		}
	}
}
