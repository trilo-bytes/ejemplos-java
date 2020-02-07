package org.patrones.comportamiento.mediador;

public class EjemploMediador {
	/**
	 * @See https://dzone.com/refcardz/design-patterns?chapter=6
	 */
	public static void main(String[] args) {
		IMediador mediador = new Mediador();

		Amigo enfadado1 = new AmigoEnfadado(mediador, "Pedro");
		Amigo enfadado2 = new AmigoEnfadado(mediador, "Luis");

		mediador.añadirAmigo(enfadado1);
		mediador.añadirAmigo(enfadado2);

		enfadado1.decir("Hola...", enfadado2);
		enfadado2.decir("No", enfadado1);

	}

}
