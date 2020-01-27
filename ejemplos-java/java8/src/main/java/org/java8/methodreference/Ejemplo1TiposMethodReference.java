package org.java8.methodreference;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Ejemplo1TiposMethodReference {

	public static void main(String[] args) {
		// Metodo estatico
		ToIntFunction<String> stringAInt = Integer::parseInt;
		System.out.println(stringAInt.applyAsInt("125"));

		// Referencia instancia
		ToIntFunction<String> pintarTamaño = String::length;
		System.out.println(pintarTamaño.applyAsInt("palabra"));

		// Referencia instancia de un objeto existente
		String palabra = "palabra";
		IntFunction<String> subString = palabra::substring;
		System.out.println(subString.apply(4));

	}

}
