package org.patrones.comportamiento.mediador;

public interface IMediador {

	public void enviarMensaje(String msg, Amigo amigo);

	void añadirAmigo(Amigo amigo);
}
