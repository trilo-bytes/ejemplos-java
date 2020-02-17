package org.patrones.comportamiento.strategy;

import java.util.function.UnaryOperator;

public class StrategyMain {

	/**
	 * https://dzone.com/refcardz/design-patterns?chapter=10
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String modo = "1";

		UnaryOperator<String> mayusculas = String::toUpperCase;
		UnaryOperator<String> minusculas = String::toLowerCase;

		if ("0".equals(modo)) {
			aplicar(minusculas, "Hola");
		} else {
			aplicar(mayusculas, "Hola");
		}

	}

	private static void aplicar(UnaryOperator<String> operador, String string) {
		System.out.println(operador.apply(string));
	}

}
