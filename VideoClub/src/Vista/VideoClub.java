package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;

public class VideoClub {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Pelicula> videoClub = new ArrayList<Pelicula>();

	public static void main(String[] args) {

		String opcion = "0";

		do {

			opcion = mostrarMenu();

			switch (opcion) {
			case "1":
				 altaPelicula();
				 
				break;
			case "2":
				listarPelicula();
				break;
			case "3":
				buscaTitulo();
				break;
			case "4":
				buscaGenero();
			default:
				System.out.println("Hasta luego Maricarmen");

			}
		} while (!opcion.equals("0"));
		System.out.println("Hasta pronto");

	}

	

	private static void buscaGenero() {
		String genero = "";
		System.out.println("Genero de la pelicula");
		genero = sc.nextLine();
		//if (genero.contentEquals(genero)) {
		
		for (Pelicula p : videoClub) {
			if (genero.contentEquals(genero)){
				System.out.println(p);
			}
		}
			
			System.out.println();
			
		}
			
		
	//}



	private static String mostrarMenu() {
		System.out.println("Elige la opcion del menu");
		System.out.println("1 -Alta pelicula");
		System.out.println("2 -Lista peliculas");
		System.out.println("3 -Buscar pelicula por titulo");
		System.out.println("4 -Buscar pelicula por genero");
		System.out.println("0 -Salir del programa");
		
		String opcion = sc.nextLine();
		return opcion;
	}

	private static void buscaTitulo() {
		String titulo = "";
		System.out.println("Titulo de la pelicula");
		titulo = sc.nextLine();
		if (titulo.contentEquals(titulo)){
			System.out.println();
			
		
			
		}
	}

	private static void listarPelicula() {
		//System.out.println("El listado de peliculas es el siguiente: " + "\n" + videoClub);
		for (Pelicula ele : videoClub) {
			System.out.println("El listado de peliculas es el siguiente:" + ele);
		}
	}

	private static Pelicula altaPelicula() {
		
		Pelicula pelicula = new Pelicula();
		Director director = new Director();
		
		System.out.println("Titulo pelicula");
		String nombre = sc.nextLine();
	
		pelicula.setTitulo(nombre);;
		System.out.println("Genero pelicula");
		String genero = sc.nextLine();
		pelicula.setGenero(genero);
		
		
		System.out.println("Nombre Director pelicula");
		String nombDir = sc.nextLine();
		director.setNombDir(nombDir);
		System.out.println("Edad director");
		String edad = sc.nextLine();
		director.setEdad(edad);
		
		
		System.out.println("A�o de estreno");
		String a�oEstreno = sc.nextLine();
		pelicula.setA�oEstreno(a�oEstreno);
		
		pelicula.setDirector(director);
		videoClub.add(pelicula);
		

		return null;
	}

}
