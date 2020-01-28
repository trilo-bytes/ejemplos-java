package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo3FilterUnique {
	public static void main(String[] args) {
		List<Character> lista = Arrays.asList('A', 'b', 'C', 'C');
		lista.stream().filter(Character::isUpperCase).distinct().forEach(System.out::println);
	}
}
