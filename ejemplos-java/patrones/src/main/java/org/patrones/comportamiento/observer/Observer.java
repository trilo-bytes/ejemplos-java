package org.patrones.comportamiento.observer;

public abstract class Observer {
	protected Observado observado;

	public abstract void actualizar();
}
