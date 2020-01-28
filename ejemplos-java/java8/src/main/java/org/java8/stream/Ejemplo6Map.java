package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Ejemplo6Map {
	public static void main(String[] args) {
		List<Persona> lista = Arrays.asList(new Persona("Jose", "Perez"), new Persona("Juan", "Gutierrez"),
				new Persona("Luis", "Perez"));
		lista.stream().map(Persona::getNombre).forEach(System.out::println);
	}
}

class Persona {
	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
