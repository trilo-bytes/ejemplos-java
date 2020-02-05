package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo8Reduce {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		Integer sumaPares = lista.parallelStream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
		System.out.println(sumaPares);
	}
}
