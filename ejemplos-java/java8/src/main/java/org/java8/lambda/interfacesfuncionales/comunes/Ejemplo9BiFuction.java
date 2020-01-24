package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.function.BiFunction;

public class Ejemplo9BiFuction {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> sumarStrings = (s1, s2) -> Integer.valueOf(s1) + Integer.valueOf(s2);
		System.out.println(sumarStrings.apply("1", "5"));

		BiFunction<Integer, Integer, Integer> sumarInteger = (a, b) -> a + b;
		System.out.println(sumarInteger.apply(100, 200));
	}

}
