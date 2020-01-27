package org.patrones.comportamiento.cadenaresponsabilidad;

public class Fabrica extends ITrabajador {

	@Override
	public void hacerTrabajo(Trabajo trabajo) {
		ITrabajador trabajador1 = new Trabajador1();
		ITrabajador trabajador2 = new Trabajador2();
		ITrabajador trabajador3 = new Trabajador3();

		trabajador1.añadirSiguiente(trabajador2);
		trabajador2.añadirSiguiente(trabajador3);

		añadirSiguiente(trabajador1);

		System.out.println("Ha llegado un nuevo trabajo");
		siguiente.hacerTrabajo(trabajo);
	}
}
