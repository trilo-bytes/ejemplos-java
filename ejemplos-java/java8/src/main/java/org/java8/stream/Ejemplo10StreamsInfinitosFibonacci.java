package org.java8.stream;

import java.util.stream.Stream;

public class Ejemplo10StreamsInfinitosFibonacci {
	public static void main(String[] args) {
		Stream.iterate(new Numero(0, 1), n -> new Numero(n.getActual(), n.getActual() + n.getAnterior())).limit(20)
				.forEach(n -> System.out.println(n.getActual()));
	}
}

class Numero {
	private int anterior;
	private int actual;

	public Numero(int anterior, int actual) {
		super();
		this.anterior = anterior;
		this.actual = actual;
	}

	public int getAnterior() {
		return anterior;
	}

	public void setAnterior(int anterior) {
		this.anterior = anterior;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}

	@Override
	public String toString() {
		return "Numero [anterior=" + anterior + ", actual=" + actual + "]";
	}

}