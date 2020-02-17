package org.patrones.comportamiento.templatemethod;

public class Pepito extends Niño {

	@Override
	protected void hacerAmigos(String amigo) {
		System.out.println("Pepito se hace amigo de " + amigo);
	}

	@Override
	protected String elegirCompañero() {
		System.out.println("Pepito elige como compañero a Juanito");
		return "Juanito";

	}

	@Override
	protected void presentarse() {
		System.out.println("Pepito se presenta");

	}

	@Override
	protected boolean jugar(String compañero) {
		System.out.println("Pepito juega con " + compañero);
		return true;
	}

}
