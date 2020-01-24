package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.function.Predicate;

public class Ejemplo1PredicateMetodosDefault {

	public static void main(String[] args) {
		Predicate<Integer> esPar = (Integer i) -> i % 2 == 0;
		Predicate<Integer> positivo = (Integer i) -> i > 0;

		System.out.println("Es par 2 : " + esPar.test(2));
		System.out.println("No es par 2: " + esPar.negate().test(2));
		System.out.println("Es par y positivo 2 : " + esPar.and(positivo).test(2));
		System.out.println("Es par y positivo 3 : " + esPar.and(positivo).test(3));
		System.out.println("Es par o positivo 3 : " + esPar.or(positivo).test(3));

	}

}
