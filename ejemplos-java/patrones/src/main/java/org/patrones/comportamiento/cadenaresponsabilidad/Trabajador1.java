package org.patrones.comportamiento.cadenaresponsabilidad;

public class Trabajador1 extends ITrabajador {

	@Override
	public void hacerTrabajo(Trabajo trabajo) {
		if (trabajo.getTipoTrabajo().equals(TipoTrabajo.TIPO1)) {
			System.out.println("Trabajador 1 hace: " + trabajo.getTrabajo());
		} else {
			System.out.println("Trabajador 1 no puede hacer tipo " + trabajo);
			siguiente.hacerTrabajo(trabajo);
		}

	}
}
