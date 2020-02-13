package org.patrones.comportamiento.observer;

public class Observador2 extends Observer {

	public Observador2(Observado observado) {
		this.observado = observado;
		this.observado.añadirObservador(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Observador2: El estado cambia a " + observado.getEstado());
	}
}