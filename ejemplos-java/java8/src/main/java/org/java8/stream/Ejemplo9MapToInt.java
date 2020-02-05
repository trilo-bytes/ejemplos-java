package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo9MapToInt {
	public static void main(String[] args) {
		List<Clase> lista = Arrays.asList(new Clase(1), new Clase(2), new Clase(3));
		System.out.println("Suma: " + lista.stream().mapToInt(Clase::getNumero).sum());
		System.out.println("Max: " + lista.stream().mapToInt(Clase::getNumero).max().getAsInt());
		System.out.println("Min: " + lista.stream().mapToInt(Clase::getNumero).min().getAsInt());
	}
}

class Clase {
	private Integer numero;

	public Clase(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
