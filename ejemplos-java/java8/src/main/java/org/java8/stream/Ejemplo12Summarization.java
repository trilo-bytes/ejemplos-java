package org.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo12Summarization {
	public static void main(String[] args) {
		List<Precio> lista = Arrays.asList(new Precio(0), new Precio(1), new Precio(2), new Precio(1), new Precio(3),
				new Precio(3), new Precio(2));
		Integer total = lista.stream().collect(Collectors.summingInt(Precio::getPrecio));
		System.out.println("Total precios: " + total);

		Double media = lista.stream().collect(Collectors.averagingInt(Precio::getPrecio));
		System.out.println("Media precios: " + media);

		IntSummaryStatistics estadisticasLista = lista.stream().collect(Collectors.summarizingInt(Precio::getPrecio));

		System.out.println("Estadisticas: " + estadisticasLista);

	}
}
