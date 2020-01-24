package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

public class EjemploFuction {
	public static void main(String[] args) {
		List<String> listaString = Arrays.asList("casa", "10", "10casas");

		System.out.println("Antes: " + listaString);
		Function<String, Integer> transformarInteger = (String s) -> Integer.valueOf(s);
		List<Integer> listaInteger = transformarANumeros(listaString, transformarInteger);
		System.out.println("Despues: " + listaInteger);
	}

	public static <T, R> List<R> transformarANumeros(List<T> list, Function<T, R> c) {
		List<R> listaTransformada = new ArrayList<R>();
		for (T s : list) {
			if (isNumeric(s)) {
				listaTransformada.add(c.apply(s));
			}
		}

		return listaTransformada;
	}

	private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	public static <T> boolean isNumeric(T strNum) {
		if (strNum == null) {
			return false;
		}
		return pattern.matcher(strNum.toString()).matches();
	}

}
