package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;

public class MainCliente {

	public static ApplicationContext context;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		context = new ClassPathXmlApplicationContext("context.xml");

		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);

		String opcion = "0";
		do {
			System.out.println("1- Alta de cliente");
			System.out.println("2- listar de clientes ");
			System.out.println("3- Buscar cliente por id");
			System.out.println("4- Buscar cliente por nombre");
			System.out.println("5- Borrar cliente");
			System.out.println("0- Salir");

			opcion = sc.nextLine();

			if (opcion.equals("1")) {

				System.out.println("Introduzca el dni: ");
				String dni = sc.nextLine();
				System.out.println("Introduzca el nombre:");
				String nombre = sc.nextLine();
				System.out.println("Introduzca la edad");
				String edad = sc.nextLine();

				int iedad = Integer.parseInt(edad);

				Cliente c = context.getBean("cliente", Cliente.class);

				c.setDni(dni);
				c.setNombre(nombre);
				c.setEdad(iedad);

				int alta = gc.alta(c);
				if (alta == 0) {
					System.out.println("Cliente introducido correctamente");
				} else if (alta == 1) {
					System.out.println("El dni no esta completo");
				} else if (alta == 2) {
					System.out.println("Es necesario introducir la letra del dni");
				} else if (alta == 3) {
					System.out.println("Ya existe un cliente con ese dni");
				}
			} else if (opcion.equals("2")) {

				List<Cliente> clientes = gc.getListaClientes();
				if (clientes.size() != 0) {
					for (Cliente c : clientes) {
						System.out.println(c);
					}

				} else {
					System.out.println("Todavia no hay clientes registrados");
				}

			} else if (opcion.equals("3")) {
				System.out.println("Introduzca el ID a buscar");

				String id = sc.nextLine();
				int iid = Integer.parseInt(id);

				Cliente c = gc.buscarPorId(iid);
				if (c == null) {
					System.out.println("El libro no se ha encontrado");
				} else {
					System.out.println(c);
				}
			} else if (opcion.equals("4")) {
				System.out.println("Introduzca el nombre a buscar");
				String nombre = sc.nextLine();

				List<Cliente> lista = gc.buscarPorNombre(nombre);
				if (lista.size() != 0) {
					System.out.println("La lista de clientes por nombre es:");
					for (Cliente c : lista) {
						System.out.println(c);
					}
				} else {
					System.out.println("No hay conincidencias por editorial");
				}
			} else if (opcion.equals("5")) {

				System.out.println("Introduzca el id del cliente a borrar");

				String id = sc.nextLine();
				int iid = Integer.parseInt(id);

				boolean c = gc.borrarPorId(iid);

			}

		} while (!opcion.equals("0"));
		System.out.println("Fin del programa");

	}

}
