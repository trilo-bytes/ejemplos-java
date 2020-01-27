package org.patrones.comportamiento.comando;

public class ComandoSubirCanal implements Comando {

	private Receptor receptor;

	public ComandoSubirCanal(Receptor receptor) {
		this.receptor = receptor;
	}

	@Override
	public void ejecutar() {
		receptor.subirCanal();
	}

}
