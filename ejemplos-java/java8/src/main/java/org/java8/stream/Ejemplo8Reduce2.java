package org.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejemplo8Reduce2 {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		Optional<Integer> sumaPares = lista.stream().reduce(Integer::sum);
		System.out.println(sumaPares.get());
	}
}
