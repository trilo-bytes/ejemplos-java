package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class EjemploBinaryOperator {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Antes: " + lista);
		BinaryOperator<Integer> multiplicar = (Integer a, Integer b) -> a * b;
		List<Integer> listadoModificado = aplicarOperador(lista, multiplicar);
		System.out.println("Despues: " + listadoModificado);
	}

	public static <T> List<T> aplicarOperador(List<T> list, BinaryOperator<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			results.add(p.apply(s, s));
		}
		return results;
	}

}
