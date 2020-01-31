package org.patrones.comportamiento.mediador;

public abstract class Amigo {
	protected IMediador mediador;
	protected String nombre;

	public Amigo(IMediador mediador, String nombre) {
		this.mediador = mediador;
		this.nombre = nombre;
	}

	public abstract void decir(String msg, Amigo amigo);

	public abstract void escuchar(String msg);

	public String getNombre() {
		return nombre;
	}
}