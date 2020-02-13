package org.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {

	private List<Observer> listadoObservadores = new ArrayList<>();
	private int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarObservadores();
	}

	public void añadirObservador(Observer observador) {
		listadoObservadores.add(observador);
	}

	public void notificarObservadores() {
		for (Observer observer : listadoObservadores) {
			observer.actualizar();
		}
	}
}
