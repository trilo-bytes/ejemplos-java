package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ejemplo1Predicate {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("casa", "abaco", "almohada", "peluche", "");

		System.out.println("Antes: " + lista);
		Predicate<String> predicadoStringVacio = (String s) -> !s.isEmpty();
		List<String> listadoNoVacio = filtrar(lista, predicadoStringVacio);
		System.out.println("Despues: " + listadoNoVacio);
	}

	public static <T> List<T> filtrar(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}

}
