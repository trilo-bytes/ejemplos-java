package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo2Consumer {

	public static void main(String[] args) {
		List<String> listado = Arrays.asList("casa", "abaco", "almohada", "peluche", "");

		Consumer<String> consumerPintar = (String s) -> System.out.println(s);
		pintar(listado, consumerPintar);
	}

	public static <T> void pintar(List<T> list, Consumer<T> c) {
		for (T s : list) {
			c.accept(s);
		}
	}

}
