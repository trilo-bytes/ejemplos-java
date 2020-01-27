package org.patrones.comportamiento.comando;

public class Invocador {
	private Comando comando;

	public void setComando(Comando comando) {
		this.comando = comando;
	}

	public void pulsarBoton() {
		comando.ejecutar();
	}
}
