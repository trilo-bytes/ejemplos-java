package org.patrones.comportamiento.state;

public class Tarea {

	private EstadoTarea estado;

	public Tarea() {
		this.estado = EstadoTareaNueva.getInstance();
	}

	public void setEstadoActual(EstadoTarea estado) {
		this.estado = estado;
	}

	public void actualizar() {
		estado.actualizarEstado(this);
	}

}
