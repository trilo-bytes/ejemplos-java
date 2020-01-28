package org.patrones.comportamiento.interpreter.cadenaresponsabilidad;

public class ExpresionSuma extends Expresion {

	@Override
	public int resolverExpresion(String expresion) {
		if (expresion.contains(TipoExpresion.SUMA.getSimbolo())) {
			int a = Integer.parseInt(expresion.split("\\+")[0]);
			int b = Integer.parseInt(expresion.split("\\+")[1]);

			return a + b;
		} else {
			return siguiente.resolverExpresion(expresion);
		}
	}
}
