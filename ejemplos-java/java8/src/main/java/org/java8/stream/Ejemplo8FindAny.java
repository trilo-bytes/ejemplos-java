package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo8FindAny {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		lista.stream().filter(i -> i % 2 == 0).findAny().ifPresent(System.out::println);
	}
}
