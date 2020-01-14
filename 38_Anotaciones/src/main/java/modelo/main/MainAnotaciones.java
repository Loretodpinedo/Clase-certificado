package modelo.main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;

public class MainAnotaciones {

	private static ApplicationContext context;

	public static ArrayList<Pelicula> pelis;
	public static ArrayList<Pelicula> pelisGenero;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("context.xml");

		pelis = context.getBean("peliculas", ArrayList.class);
		pelisGenero = context.getBean("peliculasGenero", ArrayList.class);

		int opcion = 0;

		do {

			opcion = mostrarMenu();

			switch (opcion) {
			case 1:
				altaPelicula();

				break;
			case 2:
				listarPelicula();
				break;
			case 3:
				buscaTitulo();
				break;
			case 4:
				buscaGenero();
				break;
			default:
				System.out.println("Hasta luego Maricarmen");

			}
		} while (opcion != 0);
		System.out.println("Hasta pronto");

	}

	private static int mostrarMenu() {
		System.out.println("Elige la opcion del menu");
		System.out.println("1 -Alta pelicula");
		System.out.println("2 -Lista peliculas");
		System.out.println("3 -Buscar pelicula por titulo");
		System.out.println("4 -Buscar pelicula por genero");
		System.out.println("0 -Salir del programa");
		int opcion = sc.nextInt();
		if (opcion < 0 || opcion > 4) {
			System.out.println("Opcion inexistente");
		}
		return opcion;
	}

	private static void listarPelicula() {

		for (Pelicula peli : pelis) {
			System.out.println("El listado de peliculas es el siguiente:" + peli);
		}
	}

	private static void buscaTitulo() {
		String titulo = "";
		System.out.println("Titulo de la pelicula");
		titulo = sc.nextLine();
		String titulo2 = sc.nextLine();

		for (Pelicula peli : pelis) {
			if (peli.getTitulo().equals(titulo)) {
				System.out.println(peli.getTitulo());

			} else {
				System.out.println("No hay ninguna pelicula con ese titulo");
			}
		}
	}

//da error arrglar
	private static void buscaGenero() {
		String genero = "";
		System.out.println("Genero de la pelicula");
		genero = sc.nextLine();
		String genero2 = sc.nextLine();

		for (Pelicula peli : pelis) {
			if (peli.getGenero().equals(genero) || peli.getGenero().equals(genero2)) {
				pelisGenero.add(peli);
				System.out.println(pelisGenero);

			} else {
				System.out.println("No hay ninguna pelicula de este genero");
			}

		}

	}

	private static Pelicula altaPelicula() {

		Pelicula peli = (Pelicula) context.getBean("pelicula");
		Director direc = (Director) context.getBean("director");

		System.out.println("Titulo pelicula");
		String nombre = sc.nextLine();
		String nombre1 = sc.nextLine();

		peli.setTitulo(nombre);

		System.out.println("Genero pelicula");
		String genero = sc.nextLine();
		peli.setGenero(genero);

		System.out.println("Nombre Director pelicula");
		String nombDir = sc.nextLine();
		direc.setNombDir(nombDir);
		System.out.println("Edad director");
		String edad = sc.nextLine();
		direc.setEdad(edad);

		System.out.println("Año de estreno");
		String añoEstreno = sc.nextLine();
		peli.setAñoEstreno(añoEstreno);

		peli.setDirector(direc);
		pelis.add(peli);

		return null;
	}

}
