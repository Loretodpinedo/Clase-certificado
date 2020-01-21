package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Libro;
import modelo.negocio.GestorLibreria;

public class MainLibreria {

	static ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		GestorLibreria gl = context.getBean("gestorLibreria", GestorLibreria.class);

		String opcion = "0";
		do {
			System.out.println("Marca la opcion deseada: ");
			System.out.println("1- Alta de libro");
			System.out.println("2- lista de libros");
			System.out.println("3- Modificar libro");
			System.out.println("4- Obtener libro");
			System.out.println("5- Buscar por título");
			System.out.println("6- Buscar por editorial");
			System.out.println("7- Buscar por ISBN");
			System.out.println("8- Buscar por título y editorial");
			System.out.println("9- Borrar libro");
			System.out.println("0- Salir");
			opcion = sc.nextLine();

			if (opcion.equals("1")) {

				Libro l = pedirDatos();
				
				/*Falla ver como
				 * List<Libro> isbn = gl.buscarIsbin(); 
				

				if ((l.getIsbn().equals(gl.buscarIsbin(isbn)))) {

					System.out.println("El ISBN esta repetido");

				} else */{

					gl.alta(l);

					System.out.println("El libro" + l + " se ha introducido correctamente");
				}
			} else if (opcion.equals("2")) {

				System.out.println("Los libros guardados son: ");
				System.out.println(gl.listar());

			} else if (opcion.equals("3")) {

				System.out.println("Introduzca el Id del libro que quieres modificar");
				String id = sc.nextLine();
				int iId = Integer.parseInt(id);

				Libro l = pedirDatos();

				l.setId(iId);

				System.out.println(gl.modificar(l));

			} else if (opcion.equals("4")) {

				int id = pedirId();
				System.out.println(gl.obtener(id));

			} else if (opcion.equals("5")) {

				System.out.println("Introduzca el titulo a buscar");
				String titulo = sc.nextLine();

				List<Libro> lib = gl.buscarPorTitulo(titulo);

				if (lib.isEmpty()) {

					System.out.println("No hay libros con ese titulo");
				} else {

					System.out.println(gl.buscarPorTitulo(titulo));
				}
			} else if (opcion.equals("6")) {

				System.out.println("Introduzca la editorial");
				String editorial = sc.nextLine();
				System.out.println(gl.buscarPorEditorial(editorial));

			} else if (opcion.equals("7")) {

				System.out.println("Introduzca el ISBIN a buscar");
				String isbn = sc.nextLine();
				System.out.println(gl.buscarIsbin(isbn));

			} else if (opcion.equals("8")) {

				System.out.println("Introduzca el titulo");
				String titulo = sc.nextLine();
				System.out.println("Introduzca la editorial");
				String editorial = sc.nextLine();

				System.out.println(gl.buscarPorTituloYEditorial(titulo, editorial));

			} else if (opcion.equals("9")) {

				int id = pedirId();
				gl.borrarId(id);
				System.out.println("El libro se ha borrado correctamente.");

			}

		} while (!opcion.equals("0"));
		System.out.println("Fin del programa");

	}

	public static Libro pedirDatos() {

		Libro l = context.getBean("libro", Libro.class);
		System.out.println("Introduzca el titulo:");
		String titulo = sc.nextLine();
		System.out.println("Introduzca el editorial:");
		String editorial = sc.nextLine();
		System.out.println("Introduzca el isbn");
		String isbn = sc.nextLine();
		System.out.println("Introduzca el año de publicacion");
		String anioPublicacion = sc.nextLine();

		int iAnioPublicacion = Integer.parseInt(anioPublicacion);

		l.setTitulo(titulo);
		l.setEditorial(editorial);
		l.setAnioPublicacion(iAnioPublicacion);
		l.setIsbn(isbn);

		return l;

	}

	public static int pedirId() {

		System.out.println("Introduzca el Id del libro");
		String id = sc.nextLine();

		int iId = Integer.parseInt(id);

		return iId;
	}

}
