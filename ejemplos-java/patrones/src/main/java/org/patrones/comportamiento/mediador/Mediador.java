package org.patrones.comportamiento.mediador;

import java.util.ArrayList;
import java.util.List;

public class Mediador implements IMediador {

	private List<Amigo> amigos;

	public Mediador() {
		amigos = new ArrayList<>();
	}

	@Override
	public void enviarMensaje(String msg, Amigo amigo) {
		amigos.stream().filter(amigo::equals).findAny().ifPresent(a -> a.escuchar(msg));
	}

	@Override
	public void añadirAmigo(Amigo amigo) {
		amigos.add(amigo);
	}

}
