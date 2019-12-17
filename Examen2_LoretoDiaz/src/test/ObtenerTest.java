package test;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class ObtenerTest {

	public static void main(String[] args) {
		
		DaoPelicula daopelicula = new DaoPelicula();

		

		Pelicula obtenerPelicula = daopelicula.obtener(1);

		System.out.println("La pelicula seleccionada es " + obtenerPelicula);

	}


	}


