package org.patrones.comportamiento.iterator;

public class ColeccionMensajes implements Coleccion<Mensaje> {

	static final int MAXIMO = 5;
	int actual = 0;
	Mensaje[] mensajes;

	public ColeccionMensajes() {
		mensajes = new Mensaje[MAXIMO];

		añadirMensaje("Mensaje 1");
		añadirMensaje("Mensaje 2");
		añadirMensaje("Mensaje 3");
	}

	public void añadirMensaje(String texto) {
		if (actual >= MAXIMO) {
			System.out.println("No se puede añadir mas");
		} else {
			mensajes[actual] = new Mensaje(texto);
			actual = actual + 1;
		}
	}

	@Override
	public Iterador<Mensaje> crearIterador() {
		return new MensajeIterador(mensajes);
	}

}
