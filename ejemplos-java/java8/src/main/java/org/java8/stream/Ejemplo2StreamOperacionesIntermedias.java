package org.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2StreamOperacionesIntermedias {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 8);
		List<String> listaTransformada = lista.stream().filter(a -> {
			System.out.println("Filtrando " + a);
			return a % 2 == 0;
		}).distinct().limit(2).map(a -> {
			System.out.println("Mapeando " + a);
			return "Numero " + a;
		}).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(listaTransformada);
	}
}
