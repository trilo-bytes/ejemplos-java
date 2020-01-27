package org.patrones.comportamiento.cadenaresponsabilidad;

public class Trabajador2 extends ITrabajador {

	@Override
	public void hacerTrabajo(Trabajo trabajo) {
		if (trabajo.getTipoTrabajo().equals(TipoTrabajo.TIPO2)) {
			System.out.println("Trabajador 2 hace: " + trabajo.getTrabajo());
		} else {
			System.out.println("Trabajador 2 no puede hacer tipo " + trabajo);
			siguiente.hacerTrabajo(trabajo);
		}

	}

}
