package org.java8.lambda.interfacesfuncionales.comunes;

import java.util.function.Supplier;

public class EjemploSupplier {

	public static void main(String[] args) {
		Supplier<Objeto> suplier = () -> new Objeto("objeto1");
		System.out.println("Despues: " + suplier.get());
	}

}

class Objeto {
	private String codigo;

	public Objeto(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Objeto [codigo=" + codigo + "]";
	}
}
