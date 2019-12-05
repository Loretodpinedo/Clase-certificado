package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class AltaTest {

	public static void main(String[] args) {
	
		DaoPelicula daopelicula = new DaoPelicula();
	

		Pelicula p1 = new Pelicula();
		p1.setTitulo("Examen de diez");
		p1.setDirector("Loreto Diaz");
		p1.setGenero("Realidad maravillosa");
		p1.setAñoPublicacion("2019");

		boolean altapelicula = daopelicula.alta(p1);

		System.out.println("Se ha dado de alta la pelicula " + p1.getTitulo());
	}

}
