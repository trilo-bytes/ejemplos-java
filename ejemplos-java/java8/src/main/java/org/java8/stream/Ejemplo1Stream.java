package org.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1Stream {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		List<String> listaTransformada = lista.stream().filter(a -> {
			System.out.println("Filtrando " + a);
			return a % 2 == 0;
		}).map(a -> {
			System.out.println("Mapeando " + a);
			return "Numero " + a;
		}).collect(Collectors.toList());
		System.out.println(listaTransformada);
	}
}
