package org.patrones.comportamiento.interpreter;

public class InterpreterMain {

	public InterpreterContext ic;

	public InterpreterMain(InterpreterContext i) {
		this.ic = i;
	}

	public String interpret(String str) {
		Expresion exp = null;
		if (str.contains("+")) {
			exp = new ExpresionSumar(Integer.parseInt(str.split("\\+")[0]), Integer.parseInt(str.split("\\+")[1]));
		} else if (str.contains("-")) {
			exp = new ExpresionRestar(Integer.parseInt(str.split("-")[0]), Integer.parseInt(str.split("-")[1]));
		} else {
			return str;
		}

		return String.valueOf(exp.interpretar(ic));
	}

	public static void main(String args[]) {
		String str1 = "28+2";
		String str2 = "30-1";

		InterpreterMain ec = new InterpreterMain(new InterpreterContext());
		System.out.println(str1 + "= " + ec.interpret(str1));
		System.out.println(str2 + "= " + ec.interpret(str2));

	}
}
