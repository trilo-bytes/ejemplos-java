package org.patrones.comportamiento.mediador;

public class AmigoEnfadado extends Amigo {

	public AmigoEnfadado(IMediador mediador, String nombre) {
		super(mediador, nombre);
	}

	@Override
	public void escuchar(String msg) {
		System.out.println("A " + nombre + " le dicen '" + msg + "'");

	}

	@Override
	public void decir(String msg, Amigo amigo) {
		System.out.println(nombre + " quiere decir: '" + msg + "' a " + amigo.getNombre());
		mediador.enviarMensaje(msg, amigo);
	}

}
