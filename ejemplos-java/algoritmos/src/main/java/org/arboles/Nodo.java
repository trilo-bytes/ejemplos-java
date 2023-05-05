package org.arboles;

public class Nodo {
	private String idPadre;
	private String idNodo;

	public Nodo(String idPadre, String idNodo) {
		this.idPadre = idPadre;
		this.idNodo = idNodo;
	}

	public String getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(String idPadre) {
		this.idPadre = idPadre;
	}

	public String getIdNodo() {
		return idNodo;
	}

	public void setIdNodo(String idNodo) {
		this.idNodo = idNodo;
	}

	@Override
	public String toString() {
		return "Nodo [idPadre=" + idPadre + ", idNodo=" + idNodo + "]";
	}


}