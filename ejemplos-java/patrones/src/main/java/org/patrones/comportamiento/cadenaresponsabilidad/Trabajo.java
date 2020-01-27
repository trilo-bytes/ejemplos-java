package org.patrones.comportamiento.cadenaresponsabilidad;

public class Trabajo {

	private String trabajo;
	private TipoTrabajo tipoTrabajo;

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public TipoTrabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	@Override
	public String toString() {
		return "Trabajo [trabajo=" + trabajo + ", tipoTrabajo=" + tipoTrabajo + "]";
	}

}
