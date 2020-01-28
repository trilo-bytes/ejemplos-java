package org.patrones.comportamiento.interpreter.cadenaresponsabilidad;

public enum TipoExpresion {
	SUMA("+"), RESTA("-");

	private String simbolo;

	TipoExpresion(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getSimbolo() {
		return simbolo;
	}
}
