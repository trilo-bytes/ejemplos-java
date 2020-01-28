package org.patrones.comportamiento.interpreter.cadenaresponsabilidad;

public class ExpresionDesconocida extends Expresion {

	@Override
	public int resolverExpresion(String expresion) {
		System.out.println("Expresion desconocida");
		return 0;
	}

}
