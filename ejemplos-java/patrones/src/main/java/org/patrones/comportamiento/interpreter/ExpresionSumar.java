package org.patrones.comportamiento.interpreter;

public class ExpresionSumar implements Expresion {

	private int a;
	private int b;

	public ExpresionSumar(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int interpretar(InterpreterContext ic) {
		return ic.sumar(a, b);
	}

}
