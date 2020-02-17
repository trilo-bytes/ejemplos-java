package org.patrones.comportamiento.observer;

public class PatronObserverEjemplo {

	/**
	 * https://dzone.com/refcardz/design-patterns?chapter=8
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Observado objetoObservado = new Observado();

		new Observador1(objetoObservado);
		new Observador2(objetoObservado);

		System.out.println("Primer cambio: 2");
		objetoObservado.setEstado(2);

		System.out.println("\nSegundo cambio: 5");
		objetoObservado.setEstado(5);

	}
}
