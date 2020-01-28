package org.java8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ejemplo4Constructor {

	public static void main(String[] args) {
		Supplier<Manzana> supplier = Manzana::new;
		System.out.println(supplier.get());

		Function<String, Manzana> function = Manzana::new;
		System.out.println(function.apply("verde"));
	}
}

class Manzana {

	private String color;

	public Manzana() {
		this.color = "rojo";
	}

	public Manzana(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Manzana de color " + color;
	}

}
