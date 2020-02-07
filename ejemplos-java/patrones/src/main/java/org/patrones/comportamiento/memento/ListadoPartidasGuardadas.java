package org.patrones.comportamiento.memento;

import java.util.ArrayList;
import java.util.List;

public class ListadoPartidasGuardadas {
	private List<PartidaGuardada> listadoPartidas = new ArrayList<PartidaGuardada>();

	public void añadirPartida(PartidaGuardada state) {
		listadoPartidas.add(state);
	}

	public PartidaGuardada get(int index) {
		return listadoPartidas.get(index);
	}
}
