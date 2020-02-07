package org.patrones.comportamiento.memento;

public class EjemploMemento {
	/**
	 * Ejemplo patron memento como en un videojuego
	 * 
	 * @see https://dzone.com/refcardz/design-patterns?chapter=7
	 * @param args
	 */
	public static void main(String[] args) {

		Partida partida = new Partida();
		ListadoPartidasGuardadas listado = new ListadoPartidasGuardadas();

		partida.setEstado(".");
		partida.setEstado("..");
		listado.añadirPartida(partida.guardarPartida());

		partida.setEstado("...");
		listado.añadirPartida(partida.guardarPartida());

		partida.setEstado("....");
		System.out.println("Partida actual: " + partida.getEstado());

		partida.cargarPartida(listado.get(0));
		System.out.println("Primera guardada: " + partida.getEstado());

		partida.cargarPartida(listado.get(1));
		System.out.println("Segunda guardada: " + partida.getEstado());
	}
}
