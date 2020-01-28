package org.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Ejemplo1Comparator {

	public static void main(String[] args) {

		List<Manzana> manzanas = crearListado();

		System.out.println("Antes: " + manzanas);
		manzanas.sort(Comparator.comparing(Manzana::getColor).reversed().thenComparing(Manzana::getPeso));
		System.out.println("Despues: " + manzanas);
	}

	private static List<Manzana> crearListado() {
		List<Manzana> manzanas = new ArrayList<>();

		BiFunction<Integer, String, Manzana> crearManzana = Manzana::new;

		manzanas.add(crearManzana.apply(1, "rojo"));
		manzanas.add(crearManzana.apply(1, "verde"));
		manzanas.add(crearManzana.apply(2, "rojo"));
		manzanas.add(crearManzana.apply(3, "rojo"));
		manzanas.add(crearManzana.apply(4, "verde"));
		Collections.shuffle(manzanas);
		return manzanas;
	}

}

class Manzana {

	private Integer peso;
	private String color;

	public Manzana(Integer peso, String color) {
		super();
		this.peso = peso;
		this.color = color;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Manzana [peso=" + peso + ", color=" + color + "]";
	}
}
