package org.patrones.comportamiento.interpreter.cadenaresponsabilidad;

public abstract class Expresion {

	protected Expresion siguiente;

	public abstract int resolverExpresion(String expresion);

	public void añadirSiguiente(Expresion siguiente) {
		this.siguiente = siguiente;
	}

}
