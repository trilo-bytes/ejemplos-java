package org.patrones.comportamiento.cadenaresponsabilidad;

public class Trabajador3 extends ITrabajador {

	@Override
	public void hacerTrabajo(Trabajo trabajo) {
		if (trabajo.getTipoTrabajo().equals(TipoTrabajo.TIPO3)) {
			System.out.println("Trabajador 3 hace: " + trabajo.getTrabajo());
		} else {
			System.out.println("Trabajador 3 no puede hacer tipo " + trabajo);
		}

	}

}
