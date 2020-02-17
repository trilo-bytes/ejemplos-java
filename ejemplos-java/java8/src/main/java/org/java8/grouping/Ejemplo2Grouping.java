package org.java8.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejemplo2Grouping {

	public static void main(String[] args) {
		List<Plato> menu = Arrays.asList(new Plato(TipoPlato.CARNE, "filete", 200),
				new Plato(TipoPlato.CARNE, "pollo", 20), new Plato(TipoPlato.OTRO, "macarrones", 600));

		Map<Calorias, List<Plato>> platoPorTipo = menu.stream().collect(Collectors.groupingBy(plato -> {
			if (plato.getCalorias() <= 100)
				return Calorias.BAJO;
			else if (plato.getCalorias() <= 500)
				return Calorias.NORMAL;
			else
				return Calorias.ALTO;
		}));

		System.out.println(platoPorTipo);
	}

}
