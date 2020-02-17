package org.java8.stream;

import static java.util.stream.Collectors.maxBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejemplo11Maximo {
	public static void main(String[] args) {
		List<Precio> lista = Arrays.asList(new Precio(0), new Precio(1), new Precio(2), new Precio(1), new Precio(3),
				new Precio(3), new Precio(2));
		Comparator<Precio> comparator = Comparator.comparingInt(Precio::getPrecio);
		Optional<Precio> masCaro = lista.stream().collect(maxBy(comparator));
		System.out.println(masCaro.get());

	}
}

class Precio {
	private Integer precio;

	public Precio(Integer precio) {
		super();
		this.precio = precio;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Precio [precio=" + precio + "]";
	}

}
