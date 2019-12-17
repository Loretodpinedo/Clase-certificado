package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class ModificarTest {

	public static void main(String[] args) {
		
		DaoPelicula daopelicula = new DaoPelicula();

		Pelicula p1 = new Pelicula();
		p1.setId(3);
		p1.setTitulo("Pelicula que he cambiado");
		p1.setDirector("Javier Serrano");
		p1.setAñoPublicacion("2019");
		p1.setGenero("Felicidad");

		boolean modificarPelicula = daopelicula.modificar(p1);

		System.out.println("Se ha modificado la pelicula con exito");

	}

}
