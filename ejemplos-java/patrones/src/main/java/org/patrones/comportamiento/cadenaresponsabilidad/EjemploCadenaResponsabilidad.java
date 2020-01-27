package org.patrones.comportamiento.cadenaresponsabilidad;

import java.util.ArrayList;
import java.util.List;

public class EjemploCadenaResponsabilidad {

	/**
	 * @See https://dzone.com/refcardz/design-patterns?chapter=2
	 */
	public static void main(String[] args) {

		List<Trabajo> trabajos = crearTrabajos();
		Fabrica fabrica = new Fabrica();

		for (Trabajo trabajo : trabajos) {
			fabrica.hacerTrabajo(trabajo);
		}
	}

	private static List<Trabajo> crearTrabajos() {
		List<Trabajo> trabajos = new ArrayList<>();

		Trabajo trabajo1 = new Trabajo();
		trabajo1.setTipoTrabajo(TipoTrabajo.TIPO2);
		trabajo1.setTrabajo("pintar coche");

		Trabajo trabajo2 = new Trabajo();
		trabajo2.setTipoTrabajo(TipoTrabajo.TIPO1);
		trabajo2.setTrabajo("montar coche");

		Trabajo trabajo3 = new Trabajo();
		trabajo3.setTipoTrabajo(TipoTrabajo.TIPO3);
		trabajo3.setTrabajo("vender coche");

		Trabajo trabajoPerdido = new Trabajo();
		trabajoPerdido.setTipoTrabajo(TipoTrabajo.TIPO4);
		trabajoPerdido.setTrabajo("esto no se llega a hacer");

		trabajos.add(trabajo1);
		trabajos.add(trabajo2);
		trabajos.add(trabajo3);
		trabajos.add(trabajoPerdido);

		return trabajos;
	}

}
