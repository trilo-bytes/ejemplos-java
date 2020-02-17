package org.patrones.comportamiento.templatemethod;

public abstract class Niño {

	public final void irAlColegio() {
		presentarse();
		String compañero = elegirCompañero();

		boolean haIdoBien = jugar(compañero);
		if (haIdoBien) {
			hacerAmigos(compañero);
		}
	}

	protected abstract void hacerAmigos(String compañero);

	protected abstract String elegirCompañero();

	protected abstract void presentarse();

	protected abstract boolean jugar(String compañero);
}
