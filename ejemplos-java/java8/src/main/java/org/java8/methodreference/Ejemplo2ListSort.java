package org.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class Ejemplo2ListSort {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("a", "b", "A", "B");
		str.sort(String::compareToIgnoreCase);

		System.out.println(str);
	}

}
