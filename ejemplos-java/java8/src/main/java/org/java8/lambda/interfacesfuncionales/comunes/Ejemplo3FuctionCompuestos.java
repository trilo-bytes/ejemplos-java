package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.function.Function;

public class Ejemplo3FuctionCompuestos {
	public static void main(String[] args) {
		Function<String, Integer> transformarInteger = (String s) -> Integer.valueOf(s);
		Function<Integer, Integer> multiplicarPorDos = (Integer s) -> s * 2;
		Function<String, Integer> transformarYmultiplicar = transformarInteger.andThen(multiplicarPorDos);
		System.out.println(transformarYmultiplicar.apply("5"));
	}

}
