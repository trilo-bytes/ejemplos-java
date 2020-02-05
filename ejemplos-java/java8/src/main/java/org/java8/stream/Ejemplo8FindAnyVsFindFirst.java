package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo8FindAnyVsFindFirst {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for (int b = 0; b < 10; b++) {
			lista.parallelStream().filter(i -> i % 2 == 0).findAny()
					.ifPresent(a -> System.out.println("Find any parallel stream: " + a));
			Thread.sleep(100);
		}

		for (int b = 0; b < 10; b++) {
			lista.parallelStream().filter(i -> i % 2 == 0).findFirst()
					.ifPresent(a -> System.out.println("Find first parallel stream: " + a));
			Thread.sleep(100);
		}

	}
}
