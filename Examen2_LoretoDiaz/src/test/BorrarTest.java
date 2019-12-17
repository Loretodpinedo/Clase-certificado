package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class BorrarTest {

	public static void main(String[] args) {
		
		DaoPelicula daopelicula = new DaoPelicula();

		Pelicula p1 = new Pelicula();
		p1.setId(3);

		boolean borrarPelicula = daopelicula.borrar(p1.getId());

		System.out.println("Se ha borrado la pelicula " + p1.getTitulo() + " con exito");

	}

}
