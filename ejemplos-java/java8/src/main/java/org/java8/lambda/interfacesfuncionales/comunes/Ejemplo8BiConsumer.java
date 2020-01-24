package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Ejemplo8BiConsumer {

	public static void main(String[] args) {
		List<String> listado = Arrays.asList("casa", "abaco", "almohada", "peluche", "");

		BiConsumer<String, String> biConsumer = (String a, String b) -> System.out.println(a + b);
		aplicarBiConsumer(listado, biConsumer);
	}

	public static void aplicarBiConsumer(List<String> list, BiConsumer<String, String> c) {
		for (String s : list) {
			c.accept("Palabra en la lista: ", s);
		}
	}

}
