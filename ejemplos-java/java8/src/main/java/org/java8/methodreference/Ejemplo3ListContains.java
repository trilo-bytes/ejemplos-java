package org.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Ejemplo3ListContains {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("a", "b", "A", "B");

		BiPredicate<List<String>, String> contains = List::contains;

		System.out.println("Tiene B: " + contains.test(str, "B"));
		System.out.println("Tiene C: " + contains.test(str, "C"));

	}

}
