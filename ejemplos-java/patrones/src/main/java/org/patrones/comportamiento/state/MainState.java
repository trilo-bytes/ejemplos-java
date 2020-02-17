package org.patrones.comportamiento.state;

public class MainState {

	/**
	 * https://dzone.com/refcardz/design-patterns?chapter=9
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tarea tarea = new Tarea();
		tarea.actualizar();
		tarea.actualizar();
		tarea.actualizar();
		tarea.actualizar();
		tarea.actualizar();

	}

}
