package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo7FlatMap {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Hello", "world");
		lista.stream().map(a -> a.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
	}
}
