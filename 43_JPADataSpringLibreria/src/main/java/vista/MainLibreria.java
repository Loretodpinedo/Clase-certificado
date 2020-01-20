package vista;

import java.util.List;
import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Libro;
import modelo.negocio.GestorLibreria;

public class MainLibreria {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		GestorLibreria gl = context.getBean("gestorLibreria", GestorLibreria.class);
		Libro l = context.getBean("libro", Libro.class);

		String opcion = "0";
		do {
			System.out.println("Marca la opcion deseada: ");
			System.out.println("1- Alta de libro");
			System.out.println("2- lista de libros");
			System.out.println("3- Modificar libro");
			System.out.println("4- Obtener libro");
			System.out.println("5- Borrar libro");
			System.out.println("0- Salir");
			opcion = sc.nextLine();

			if (opcion.equals("1")) {

				pedirDatos(l);

				gl.alta(l);

				System.out.println("El libro" + l + " se ha introducido correctamente");

			} else if (opcion.equals("2")) {

				System.out.println("Los libros guardados son: ");
				System.out.println(gl.listar());

			} else if (opcion.equals("3")) {

				System.out.println("Introduzca el Id del libro que quieres modificar");
				String id = sc.nextLine();
				int iId = Integer.parseInt(id);

				pedirDatos(l);

				l.setId(iId);

				System.out.println(gl.modificar(l));

			} else if (opcion.equals("4")) {
				
				int id = pedirId();
				System.out.println(gl.obtener(id));

			} else if (opcion.equals("5")) {

				
			
				int id = pedirId();
				gl.borrarId(id);
				System.out.println("El libro se ha borrado correctamente.");

			}

		} while (!opcion.equals("0"));
		System.out.println("Fin del programa");

	}

	public static Libro pedirDatos(Libro l) {

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
