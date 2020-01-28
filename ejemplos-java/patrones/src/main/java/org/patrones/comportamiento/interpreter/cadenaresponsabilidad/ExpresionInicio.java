package org.patrones.comportamiento.interpreter.cadenaresponsabilidad;

public class ExpresionInicio extends Expresion {

	@Override
	public int resolverExpresion(String expresion) {
		Expresion expresionSuma = new ExpresionSuma();
		Expresion expresionResta = new ExpresionResta();
		Expresion expresionDesconocida = new ExpresionDesconocida();

		expresionSuma.añadirSiguiente(expresionResta);
		expresionResta.añadirSiguiente(expresionDesconocida);
		añadirSiguiente(expresionSuma);

		return siguiente.resolverExpresion(expresion);
	}
}
