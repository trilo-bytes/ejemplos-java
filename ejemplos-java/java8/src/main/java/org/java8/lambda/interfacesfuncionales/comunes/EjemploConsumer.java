package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("casa", "abaco", "almohada", "peluche", "");

		Consumer<String> consumerPintar = (String s) -> System.out.println(s);
		pintar(listOfStrings, consumerPintar);
	}

	public static <T> void pintar(List<T> list, Consumer<T> c) {
		for (T s : list) {
			c.accept(s);
		}
	}

}
