package org.patrones.comportamiento.state;

public class EstadoTareaRealizada implements EstadoTarea {

	private static EstadoTareaRealizada estado = new EstadoTareaRealizada();

	private EstadoTareaRealizada() {
	}

	public static EstadoTareaRealizada getInstance() {
		return estado;
	}

	@Override
	public void actualizarEstado(Tarea tarea) {
		System.out.println("Tarea realizada");
		tarea.setEstadoActual(EstadoTareaFinalizada.getInstance());
	}

}
