package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class EjemploUnaryOperator {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("casa", "abaco", "almohada", "peluche", "");
		System.out.println("Antes: " + lista);
		UnaryOperator<String> operadorUnitario = (String s) -> s = "modificado " + s;
		List<String> listadoModificado = aplicarOperador(lista, operadorUnitario);
		System.out.println("Despues: " + listadoModificado);
	}

	public static <T> List<T> aplicarOperador(List<T> list, UnaryOperator<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			results.add(p.apply(s));
		}
		return results;
	}

}
