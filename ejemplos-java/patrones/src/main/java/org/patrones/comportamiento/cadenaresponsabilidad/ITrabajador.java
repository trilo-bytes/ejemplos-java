package org.patrones.comportamiento.cadenaresponsabilidad;

public abstract class ITrabajador {

	protected ITrabajador siguiente;

	public abstract void hacerTrabajo(Trabajo trabajo);

	public void añadirSiguiente(ITrabajador siguiente) {
		this.siguiente = siguiente;
	}

}
