package org.patrones.comportamiento.comando;

public class Cliente {

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
