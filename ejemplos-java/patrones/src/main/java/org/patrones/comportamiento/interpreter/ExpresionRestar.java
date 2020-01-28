package org.patrones.comportamiento.interpreter;

public class ExpresionRestar implements Expresion {

	private int a;
	private int b;

	public ExpresionRestar(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int interpretar(InterpreterContext ic) {
		return ic.restar(a, b);
	}

}
