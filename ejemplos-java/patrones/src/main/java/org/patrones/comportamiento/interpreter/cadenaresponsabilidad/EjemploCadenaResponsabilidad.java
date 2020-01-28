package org.patrones.comportamiento.interpreter.cadenaresponsabilidad;

public class EjemploCadenaResponsabilidad {

	/**
	 * @See https://dzone.com/refcardz/design-patterns?chapter=2
	 */
	public static void main(String[] args) {

		ExpresionInicio inicio = new ExpresionInicio();
		System.out.println("5+5=" + inicio.resolverExpresion("5+5"));
		System.out.println("5-10=" + inicio.resolverExpresion("5-10"));
		System.out.println("5*10=" + inicio.resolverExpresion("5*10"));

	}

}
