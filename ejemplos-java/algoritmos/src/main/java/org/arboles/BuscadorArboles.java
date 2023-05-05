package org.arboles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuscadorArboles {

	public static void main(String[] args) {
		List<Nodo> arbol = Arrays.asList(new Nodo(null, "1"), new Nodo("1", "11"), new Nodo("1", "12"),
				new Nodo("1", "21"), new Nodo("12", "121"), new Nodo("21", "211"), new Nodo("21", "212"),
				new Nodo("121", "212")); // id repetido

		buscar("212", arbol).stream().forEach(i -> System.out.println(i));
	}

	public static List<Nodo> buscar(String id, List<Nodo> arbol) {
		List<Nodo> resultado = new ArrayList<>();
		Map<String, Nodo> mapaNodos = new HashMap<>();

		for (Nodo nodo : arbol) {
			mapaNodos.put(nodo.getIdNodo(), nodo);
		}

		for (Nodo nodo : arbol) {
			if (nodo.getIdNodo().equals(id)) {
				if (!resultado.contains(nodo)) {
					resultado.add(nodo);
				}
				String idPadre = nodo.getIdPadre();

				while (idPadre != null) {
					Nodo padre = mapaNodos.get(idPadre);
					if (!resultado.contains(padre)) {
						resultado.add(padre);
					}
					idPadre = padre.getIdPadre();
				}
			}
		}

		return resultado;
	}
}
