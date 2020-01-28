package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo5Saltar {
	public static void main(String[] args) {
		List<Character> lista = Arrays.asList('A', 'b', 'C', 'C');
		lista.stream().skip(2).forEach(System.out::println);
	}
}
