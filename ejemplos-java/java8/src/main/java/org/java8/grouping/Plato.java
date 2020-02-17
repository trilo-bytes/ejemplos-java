package org.java8.grouping;

public class Plato {

	private TipoPlato tipo;
	private String nombre;
	private Integer calorias;

	public Plato(TipoPlato tipo, String nombre, Integer calorias) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.calorias = calorias;
	}

	public TipoPlato getTipo() {
		return tipo;
	}

	public void setTipo(TipoPlato tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCalorias() {
		return calorias;
	}

	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Plato [tipo=" + tipo + ", nombre=" + nombre + ", calorias=" + calorias + "]";
	}

}
