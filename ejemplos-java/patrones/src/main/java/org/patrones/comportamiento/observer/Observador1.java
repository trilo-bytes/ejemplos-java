package org.patrones.comportamiento.observer;

public class Observador1 extends Observer {

	public Observador1(Observado observado) {
		this.observado = observado;
		this.observado.añadirObservador(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Observador1: El estado cambia a " + observado.getEstado());
	}
}