package org.patrones.comportamiento.iterator;

public class MensajeIterador implements Iterador<Mensaje> {

	Mensaje[] mensajes;

	int pos = 0;

	public MensajeIterador(Mensaje[] mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public Mensaje next() {
		Mensaje mensaje = mensajes[pos];
		pos += 1;
		return mensaje;
	}

	@Override
	public boolean hasNext() {
		if (pos >= mensajes.length || mensajes[pos] == null)
			return false;
		else
			return true;
	}

}
