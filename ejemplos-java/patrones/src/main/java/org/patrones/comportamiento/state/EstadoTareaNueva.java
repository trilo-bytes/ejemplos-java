package org.patrones.comportamiento.state;

public class EstadoTareaNueva implements EstadoTarea {

	private static EstadoTareaNueva estadoTareaNueva = new EstadoTareaNueva();

	private EstadoTareaNueva() {
	}

	public static EstadoTareaNueva getInstance() {
		return estadoTareaNueva;
	}

	@Override
	public void actualizarEstado(Tarea tarea) {
		System.out.println("Tarea nueva");
		tarea.setEstadoActual(EstadoTareaRealizada.getInstance());
	}

}
