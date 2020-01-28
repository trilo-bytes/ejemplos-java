package org.patrones.comportamiento.comando;

public class Cliente {

	/**
	 * @See https://dzone.com/refcardz/design-patterns?chapter=3
	 */
	public static void main(String[] args) {
		Receptor receptor = new Receptor();
		Invocador invocador = new Invocador();

		Comando subirCanal = new ComandoSubirCanal(receptor);
		Comando bajarCanal = new ComandoBajarCanal(receptor);

		invocador.setComando(subirCanal);
		invocador.pulsarBoton();

		invocador.setComando(bajarCanal);
		invocador.pulsarBoton();
	}
}
