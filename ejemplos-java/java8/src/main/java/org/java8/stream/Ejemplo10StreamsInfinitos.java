package org.java8.stream;

import java.util.stream.Stream;

public class Ejemplo10StreamsInfinitos {
	public static void main(String[] args) {
		Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
	}
}
