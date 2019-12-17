package modelo.negocio;

import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPeliculas {

	private DaoPelicula daoPelicula;

	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}

	/**
	 * Metodo que se encarga de dar de alta una pelicula
	 * 
	 * @param pelicula la pelicula que quieres dar de alta
	 * @return 0 si se ha insertado, 1 si algun campo esta vacio, 2 si hay dos
	 *         peliculas con elmismo tipo, 3 en caso de algun error con la bbdd
	 */
	public int alta(Pelicula pelicula) {
		// comprobacion de que todos los campos estan llenos
		boolean correcto = comprobarCamposVAcios(pelicula);
		if (!correcto) {
			return 1;
		}
		// comprobamos que no ha titulos repetidos en la bdd
		boolean repetido = comprobarTituloRepetido(pelicula.getTitulo());
		if (repetido) {
			return 2;
		}
		correcto = daoPelicula.alta(pelicula);
		if (correcto) {
			return 0;
		} else {
			return 3;
		}
	}

	/**
	 * metodo que se encarga de modificar una pelicula
	 * 
	 * @param pelicula la pelicula a modificar
	 * @return 0 si se ha insertado, 1 si algun campo esta vacio, 2 si hay dos
	 *         peliculas con el mismo nombre, 3 en caso de error con la bbdd
	 */

	public int modificar(Pelicula pelicula) {
		// comprobamos que no haya campos vacios en la pelicula
		boolean correcto = comprobarCamposVAcios(pelicula);
		if (!correcto) {
			return 1;
		}
		// comprobamos que no haya 2 peliculas con el mismo titulo
		boolean repetido = comprobarTituloRepetido(pelicula.getTitulo());
		if (repetido) {
			return 2;
		}
		correcto = daoPelicula.modificar(pelicula);
		if (correcto) {
			return 0;
		} else {
			return 3;
		}
	}

	/**
	 * metodo que se encarga de borrar una pelicula
	 */
	public boolean borrar(int id) {
		return daoPelicula.borrar(id);
	}

	// metodo que se encarga de mostrar una pelicula

	public Pelicula obtener(int id) {
		return daoPelicula.obtener(id);
	}
	// metodo que se encarga de listar todas las peliculas en la base de datos

	public List<Pelicula> listar() {
		return daoPelicula.listar();
	}

	/**
	 * Metodo que se encarga de comprobar si un campo de la pelicula esta vacio
	 * 
	 * @param pelicula la pelicula que queremos comprobar
	 * @return false en caso de que algun caompo este vacio, true en caso que que
	 *         esten todos los campos rellenos
	 */

	private boolean comprobarCamposVAcios(Pelicula pelicula) {
		// comprobacion de que todos los campos estan llenos
		if (pelicula.getTitulo().isEmpty()) {
			return false;
		} else if (pelicula.getDirector().isEmpty()) {
			return false;
		} else if (pelicula.getGenero().isEmpty()) {
			return false;
		} else if (pelicula.getAñoPublicacion().isEmpty()) {
			return false;
		}
		return true;

		// Tambien se puede hacer asi
		/*
		 * if (p.getTitulo().length() == 0) { return false; } if
		 * (p.getDirector().length() == 0) { return false; } if (p.getGenero().length()
		 * == 0) { return false; } if (p.getAñoPublicacion().length() == 0) { return
		 * false; }
		 */
	}

	/**
	 * Metodo que comprueba si el titulo esta repetido en la bbdd
	 * 
	 * @param titulo el titulo que queremos comprobar
	 * @return <b>false</b> en caso de que el titulo no exista, <b>true</b> en caso
	 *         de que si exista.
	 */

	private boolean comprobarTituloRepetido(String Titulo) {
		for (Pelicula p : daoPelicula.listar()) {
			if (p.getTitulo().equals(Titulo)) {
				return true;
			}
		}
		return false;
	}
}
