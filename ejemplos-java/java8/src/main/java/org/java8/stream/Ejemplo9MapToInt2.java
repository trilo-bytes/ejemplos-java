package org.java8.stream;

import java.util.stream.IntStream;

public class Ejemplo9MapToInt2 {
	public static void main(String[] args) {
		IntStream pares = IntStream.rangeClosed(1, 100).filter(a -> a % 2 == 0);
		System.out.println(pares.count());
	}
}
