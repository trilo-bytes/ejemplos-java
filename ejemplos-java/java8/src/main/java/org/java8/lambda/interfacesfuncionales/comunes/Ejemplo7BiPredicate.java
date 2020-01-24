package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.function.BiPredicate;

public class Ejemplo7BiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> esMayor = (Integer a, Integer b) -> a > b;
		BiPredicate<Integer, Integer> esDivisor = (Integer a, Integer b) -> a % b == 0;

		System.out.println("3>2 " + esMayor.test(3, 2));
		System.out.println("9>3 y es divisor " + esMayor.and(esDivisor).test(9, 3));
	}

}
