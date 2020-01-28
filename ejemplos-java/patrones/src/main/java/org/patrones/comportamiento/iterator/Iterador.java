package org.patrones.comportamiento.iterator;

public interface Iterador<T> {
	boolean hasNext();

	T next();
}
