package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class AltaTest {

	public static void main(String[] args) {
	
		DaoPelicula daopelicula = new DaoPelicula();
	

		Pelicula p1 = new Pelicula();
		p1.setTitulo("Otra cosa mariposa");
		p1.setDirector("Lola Rey");
		p1.setGenero("ficcion");
		p1.setAñoPublicacion("1976");

		boolean altapelicula = daopelicula.alta(p1);

		System.out.println("Se ha dado de alta la pelicula " + p1.getTitulo());
	}

}
