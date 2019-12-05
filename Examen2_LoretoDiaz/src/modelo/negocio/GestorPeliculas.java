package modelo.negocio;

import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPeliculas {

	DaoPelicula dp = new DaoPelicula();
	private Pelicula pelicula;

	public boolean alta(Pelicula p) {

		if (p.getTitulo().length() == 0) {
			return false;
		}
		if (p.getDirector().length() == 0) {

			return false;
		}
		if (p.getGenero().length() == 0) {
			return false;
		}
		if (p.getAñoPublicacion().length() == 0) {
			return false;
		}
		
		//Hacer el resto de metodos con la variable dp.

		List<Pelicula> listaPeliculas = dp.listar();

		for (Pelicula peli : listaPeliculas) {

			if (peli.getTitulo().equals(p.getTitulo())) {

				return false;
			}
		}
		dp.listar().add(p);
		return true;

	}

	public DaoPelicula getDp() {
		return dp;
	}

	public void setDp(DaoPelicula dp) {
		this.dp = dp;
	}
	
	

}
