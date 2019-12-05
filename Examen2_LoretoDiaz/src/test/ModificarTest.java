package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class ModificarTest {

	public static void main(String[] args) {
		
		DaoPelicula daopelicula = new DaoPelicula();

		Pelicula p1 = new Pelicula();
		p1.setId(2);
		p1.setTitulo("Pelicula que he cambiado");
		p1.setDirector("Loreto Pinedo");
		p1.setAñoPublicacion("2019");

		boolean modificarPelicula = daopelicula.modificar(p1);

		System.out.println("Se ha modificado la pelicula con exito");

	}

}
