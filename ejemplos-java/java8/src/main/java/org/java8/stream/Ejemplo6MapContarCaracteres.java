package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo6MapContarCaracteres {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Perez", "Gutierrez", "Martinez");
		lista.stream().map(String::length).forEach(System.out::println);
	}
}
