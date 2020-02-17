package org.patrones.comportamiento.state;

public class EstadoTareaFinalizada implements EstadoTarea {

	private static EstadoTareaFinalizada estado = new EstadoTareaFinalizada();

	private EstadoTareaFinalizada() {
	}

	public static EstadoTareaFinalizada getInstance() {
		return estado;
	}

	@Override
	public void actualizarEstado(Tarea tarea) {
		System.out.println("Tarea finalizada");
	}

}
