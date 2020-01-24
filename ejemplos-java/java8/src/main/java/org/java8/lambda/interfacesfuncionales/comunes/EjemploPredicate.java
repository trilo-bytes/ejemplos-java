package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EjemploPredicate {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("casa", "abaco", "almohada", "peluche", "");

		System.out.println("Antes: " + listOfStrings);
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
		System.out.println("Despues: " + nonEmpty);
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}

}
