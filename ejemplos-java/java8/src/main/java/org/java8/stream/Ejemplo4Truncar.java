package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo4Truncar {
	public static void main(String[] args) {
		List<Character> lista = Arrays.asList('A', 'b', 'C', 'C');
		lista.stream().limit(2).forEach(System.out::println);
	}
}
