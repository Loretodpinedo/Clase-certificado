package vista;

import java.util.Scanner;
import java.util.List;

import modelo.entidad.Pelicula;
import modelo.negocio.GestorPeliculas;

public class PeliculasVista {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		GestorPeliculas gp = new GestorPeliculas();

		String opcion = "";

		do {

			System.out.println("Selecciona la opcion del menu");
			System.out.println("1- Dar de alta una pelicula");
			System.out.println("2- Dar de baja una pelicula");
			System.out.println("3- Modificar una pelicula");
			System.out.println("4- Buscar una pelicula por id");
			System.out.println("5- Listar todas las peliculas");
			System.out.println("6- Salir de la aplicacion");

			opcion = sc.nextLine();

			if (opcion.equals("1")) {

				Pelicula p = new Pelicula();

				System.out.println("Vamos a dar de alta una pelicula");
				System.out.println("Titulo");
				String titulo = sc.nextLine();
				System.out.println("Director");
				String director = sc.nextLine();
				System.out.println("Genero");
				String genero = sc.nextLine();
				System.out.println("Año de publicacion");
				String añoPublicacion = sc.nextLine();

				p.setTitulo(titulo);
				p.setDirector(director);
				p.setGenero(genero);
				p.setAñoPublicacion(añoPublicacion);

				int alta = gp.alta(p);

				if (alta == 0) {

					System.out.println("La pelicula " + p + " se ha dado de alta");
				} else if (alta == 1) {
					System.out.println("Algun campo esta vacio");
				} else if (alta == 2) {
					System.out.println("El titulo de la pelicula ya existe en la base de datos");
				} else if (alta == 3) {
					System.out.println("Ha ocurrido un error en la base de datos");
				}

			} else if (opcion.equals("2")) {

				System.out.println("¿Que pelicula quieres dar de baja?");
				//System.out.println(gp.listar());
				String id = sc.nextLine();

				int iId = Integer.parseInt(id);

				boolean borrar = gp.borrar(iId);
				if (borrar) {
					System.out.println("La pelicula se ha borrada");
				} else {
					System.out.println("La pelicula no ha sido borrada");
				}

			} else if (opcion.equals("3")) {

				System.out.println("Introduce el id de la pelicula a modificar");
				//System.out.println(gp.listar());
				String id = sc.nextLine();
				System.out.println("Introduce el titulo");
				String titulo = sc.nextLine();
				System.out.println("Introduce el director");
				String director = sc.nextLine();
				System.out.println("Introduce el genero");
				String genero = sc.nextLine();
				System.out.println("Introduce el año de estreno");
				String año = sc.nextLine();

				int iId = Integer.parseInt(id);

				Pelicula p = new Pelicula();
				p.setId(iId);
				p.setTitulo(titulo);
				p.setDirector(director);
				p.setGenero(genero);
				p.setAñoPublicacion(año);

				int modificar = gp.modificar(p);

				if (modificar == 0) {
					System.out.println("La pelicula " + p + " se ha modificado correctamente");
				} else if (modificar == 1) {
					System.out.println("Algun campo esta vacio");
				} else if (modificar == 2) {
					System.out.println("El titulo de la pelicula ya existe en la base de datos");
				} else if (modificar == 3) {
					System.out.println("Ha ocurrido un error en la base de datos");

				}
				

			}//else if (opcion.equals("4")){buscar peli por id}

		} while (opcion.equals("6"));
		System.out.println("Hasta luego Maricarmen");

	}

}
