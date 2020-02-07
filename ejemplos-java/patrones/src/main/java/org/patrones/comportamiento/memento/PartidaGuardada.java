package org.patrones.comportamiento.memento;

public class PartidaGuardada {
	private String estado;

	public PartidaGuardada(String estado) {
		this.estado = estado;
	}

	public String getState() {
		return estado;
	}
}
