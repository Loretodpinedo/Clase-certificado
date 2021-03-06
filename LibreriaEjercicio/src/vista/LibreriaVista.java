package vista;

import java.util.Scanner;
import java.util.ArrayList;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.negocio.GestorLibros;

public class LibreriaVista {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		GestorLibros gl = new GestorLibros();
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		Libreria libreria = new Libreria();
		libreria.setFavoritos(listaLibros);
		gl.setLibreria(libreria);

		String opcion = sc.nextLine();

		do {

			System.out.println("Selecciona la opcion del menu");
			System.out.println("1- Dar de alta un libro");
			System.out.println("2- Listar todos los libros");
			System.out.println("3- Buscar libro por ISBN");
			System.out.println("4- Buscar libro por editorial");

			if (opcion.equals("1")) {

				Libro libro = new Libro();

				System.out.println("ISBN");
				System.out.println("Titulo");
				System.out.println("Editorial");
				System.out.println("Aņo de publicacion");

				String isbn = sc.nextLine();
				String titulo = sc.nextLine();
				String editorial = sc.nextLine();
				String aņoPublicacion = sc.nextLine();

				libro.setIsbn(isbn);
				libro.setTitulo(titulo);
				libro.setEditorial(editorial);
				libro.setAņoPublicacion(aņoPublicacion);

				boolean alta = gl.alta(libro);

				if (alta) {
					System.out.println("El libro se ha dado de alta");
				} else {
					System.out.println(
							"Revisa que el titulo no coincida con otra pelicula o le falten el titulo o el ISBN.");
				}
			} else if (opcion.equals("2")) {

			}
		} while (opcion.equals("0"));
		System.out.println("Hasta pronto");

	}
}
