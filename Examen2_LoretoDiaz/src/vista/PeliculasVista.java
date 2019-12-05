package vista;

import java.util.Scanner;

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
			System.out.println("4- Buscar una pelicula");
			System.out.println("5- Listar todas las peliculas");
			System.out.println("6- Salir de la aplicacion");
			
			opcion = sc.nextLine();
		
			
			if (opcion.equals("1")) {
				
				Pelicula p = new Pelicula();
				
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
				
				boolean alta = gp.alta(p);
				
				if (alta) {
					
					System.out.println("La pelicula " + p +" se ha dado de alta");
				}else {
					System.out.println("La pelicula no se ha dado de alta");
				}
				
				
				
			}else if (opcion.equals("2")) {
				
				System.out.println("¿Que pelicula quieres dar de baja?");				
				System.out.println(gp.getDp().listar());
				String id = sc.nextLine();
				//Tiene que pasa por el fucking gestor y no va al dao directamente.
				boolean borrar = gp.borrar(id);
				
			}
			
		}while(opcion.equals("6"));
			System.out.println("Hasta luego Maricarmen");
		
		
	}

}
