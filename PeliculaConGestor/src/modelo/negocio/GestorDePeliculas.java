package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Pelicula;

public class GestorDePeliculas {

	private List<Pelicula> listaPeliculas = null;

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	/**
	 * Metodo que da alta una pelicula con un titulo que tenga minimo x caracteres
	 * en este caso seran 5
	 * 
	 * @param p representa la pelicula a dar de alta
	 * @return true si el titulo tiene al menos 5 caracteres false en caso contrario
	 */

	public boolean alta(Pelicula p) {
		if (p.getTitulo().length() > 5) {
			listaPeliculas.add(p);// add una pelicula a la vista
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo para buscar por titulo una pelicula
	 * 
	 * @paramtitulo de la pelicula a buscar
	 * @return pelicula en caso de se encuentre null en caso de que no se encuentre
	 */

	public Pelicula buscarPorTitulo(String titulo) {
		for (Pelicula p : listaPeliculas) {
			if (p.getTitulo().equals(titulo)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * Metodo que devuelve un array de peliculas que se encuentren a partir de un
	 * genero de la pelicula
	 * 
	 * @param genero el genero a buscar en la lista
	 * @return un array con las peliculas que tengan el mismo genero que el pasado
	 *         por el parametro de entrada. Si no hay conincidencias el array
	 *         estaria vacio
	 */

	public List<Pelicula> buscarPorGenero(String genero) {
		List<Pelicula> listaPeliculasGenero = new ArrayList<Pelicula>();
		for (Pelicula p : listaPeliculas) {
			if (p.getGenero().equalsIgnoreCase(genero)) {
				listaPeliculasGenero.add(p);
			}
		}
		return listaPeliculasGenero;
	}
}
