package org.patrones.comportamiento.iterator;

public class EjemploIterador {
	/**
	 * @See https://dzone.com/refcardz/design-patterns?chapter=5
	 */
	public static void main(String[] args) {
		ColeccionMensajes coleccion = new ColeccionMensajes();
		coleccion.añadirMensaje("nuevo mensaje 1");
		coleccion.añadirMensaje("nuevo mensaje 2");
		coleccion.añadirMensaje("nuevo mensaje 3");
		coleccion.añadirMensaje("nuevo mensaje 4");

		Iterador<Mensaje> iterador = coleccion.crearIterador();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
