package modelo.negocio;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import java.util.ArrayList;

public class GestorLibros {

	private Libreria libreria;

	// Buscar libreria.

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	// Dar de alta un libro.
	public boolean alta(Libro l) {

		if (l.getTitulo().length() == 0) {
			return false;
		}
		if (l.getIsbn().length() == 0) {

			return false;
		}

		for (Libro libro : libreria.getFavoritos()) {

			if (libro.getIsbn().equals(l.getIsbn())) {

				return false;
			}
		}
		libreria.getFavoritos().add(l);
		return true;

	}

	// Buscar por ISBN.
	public Libro buscarPorIsbn(String isbn) {
		for (Libro l : libreria.getFavoritos()) {
			if (l.getIsbn().equalsIgnoreCase(isbn))
				return l;
		}
		return null;

	}
	// Buscar por editorial
		  //devuelve-es de clase- nombre array-le paso-atributo.
	public ArrayList<Libro> buscarPorEditorial(String editorial) {
		ArrayList<Libro> listaLibrosEditorial = new ArrayList<Libro>();
		for (Libro l : libreria.getFavoritos()) {
			if (l.getEditorial().equalsIgnoreCase(editorial)) {
				listaLibrosEditorial.add(l);

			}

		}
		return listaLibrosEditorial;
	}
}
