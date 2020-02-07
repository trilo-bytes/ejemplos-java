package org.patrones.comportamiento.memento;

public class Partida {
	private String estado;

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	public PartidaGuardada guardarPartida() {
		return new PartidaGuardada(estado);
	}

	public void cargarPartida(PartidaGuardada memento) {
		estado = memento.getState();
	}
}
