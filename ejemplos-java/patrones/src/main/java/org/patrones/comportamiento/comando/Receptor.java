package org.patrones.comportamiento.comando;

public class Receptor {

	private int canal;

	public Receptor() {
		canal = 0;
	}

	public void subirCanal() {
		canal++;
		System.out.println("Subiendo canal a " + canal);
	}

	public void bajarCanal() {
		canal--;
		System.out.println("Bajando canal a " + canal);
	}
}
