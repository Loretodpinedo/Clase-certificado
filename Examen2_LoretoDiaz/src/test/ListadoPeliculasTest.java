package test;

import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;



public class ListadoPeliculasTest {

	public static void main(String[] args) {
		
		DaoPelicula daopelicula = new DaoPelicula();

		

		List<Pelicula> listapeliculas = daopelicula.listar();

		System.out.println("Los coches disponibles son  " + listapeliculas);

		

	}

}
