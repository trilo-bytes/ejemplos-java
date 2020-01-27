package org.patrones.comportamiento.comando;

public class ComandoBajarCanal implements Comando {

	private Receptor receptor;

	public ComandoBajarCanal(Receptor receptor) {
		this.receptor = receptor;
	}

	@Override
	public void ejecutar() {
		receptor.bajarCanal();
	}

}
