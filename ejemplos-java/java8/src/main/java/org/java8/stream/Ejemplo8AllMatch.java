package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo8AllMatch {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 1, 1, 2);
		if (lista.stream().noneMatch(i -> i % 2 == 0)) {
			System.out.println("Todos son impares");
		} else {
			System.out.println("No todos son impares");
		}
	}
}
