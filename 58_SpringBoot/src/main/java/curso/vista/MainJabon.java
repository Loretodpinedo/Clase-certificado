package curso.vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import curso.Application;
import curso.entidad.Jabon;
import curso.negocio.GestorJabon;

public class MainJabon {

	static ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		GestorJabon gj = context.getBean("gestorJabon", GestorJabon.class);

		String opcion = "0";
		do {
			System.out.println("Marca la opcion deseada: ");
			System.out.println("1- Alta de jabon");
			System.out.println("2- Lista de todos los jabones");
			System.out.println("3- Modificar jabon");
			System.out.println("4- Obtener Jabon");
			System.out.println("5- Buscar por nombre");
			System.out.println("6- Buscar por aceite");
			System.out.println("7- Buscar por el segundo aceite");
			System.out.println("8- Buscar por los dos aceites");
			System.out.println("9- Buscar por fase acuosa");
			System.out.println("10- Buscar por alcalí");
			System.out.println("11- Borrar jabon");
			System.out.println("0- Salir");
			opcion = sc.nextLine();

			if (opcion.equals("1")) {
				
				

				Jabon jab = pedirDatos();
				
						gj.alta(jab);

					System.out.println("El jabon" + jab + " se ha introducido correctamente");
				}
			 else if (opcion.equals("2")) {

				System.out.println("Los jabones guardados son: ");
				System.out.println(gj.listar());

			} else if (opcion.equals("3")) {

				System.out.println("Introduzca el Id del jabon que quieres modificar");
				String id = sc.nextLine();
				int iId = Integer.parseInt(id);

				Jabon j = pedirDatos();

				j.setId(iId);

				System.out.println(gj.modificar(j));

			} else if (opcion.equals("4")) {

				int id = pedirId();
				System.out.println(gj.obtener(id));

			} else if (opcion.equals("5")) {

				System.out.println("Introduzca el nombre a buscar");
				String nombre = sc.nextLine();

				List<Jabon> jab = gj.buscarPorNomJabon(nombre);

				if (jab.isEmpty()) {

					System.out.println("No hay jabones con ese nombre");
				} else {

					System.out.println(gj.buscarPorNomJabon(nombre));
				}
			} else if (opcion.equals("6")) {

				System.out.println("Introduzca el aceite a buscar");
				String aceite = sc.nextLine();
				System.out.println(gj.buscarAceite(aceite));

			} else if (opcion.equals("7")) {

				System.out.println("Introduzca el aceite a buscar");
				String aceite2 = sc.nextLine();
				System.out.println(gj.buscarPorAceite2(aceite2));

			} else if (opcion.equals("8")) {

				System.out.println("Introduzca el primer aceite");
				String aceite = sc.nextLine();
				System.out.println("Introduzca el segundo aceite");
				String aceite2 = sc.nextLine();

				System.out.println(gj.buscarPorAceiteyAceite2(aceite, aceite2));
}
			
			else if (opcion.equals("9")) {

				System.out.println("Introduzca el componente acuoso");
				String facuosa = sc.nextLine();
				System.out.println(gj.buscarPorFaseAcuosa(facuosa));
}
			
			else if (opcion.equals("10")) {

				System.out.println("Introduzca el alcalí");
				String alcali = sc.nextLine();
				System.out.println(gj.buscarPorAlcali(alcali));


			} else if (opcion.equals("11")) {

				int id = pedirId();
				gj.borrarId(id);
				System.out.println("El jabon se ha borrado correctamente.");

			}	

		}while(!opcion.equals("0"));System.out.println("Fin del programa");
	}

	public static Jabon pedirDatos() {

		Jabon j = context.getBean("jabon", Jabon.class);
		System.out.println("Introduzca el nombre:");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el aceite:");
		String aceite = sc.nextLine();
		System.out.println("Introduzca el segundo aceite");
		String aceite2 = sc.nextLine();
		System.out.println("Introduzca la fase acuosa");
		String facuosa = sc.nextLine();
		System.out.println("Introduzca el alcalí");
		String alcali = sc.nextLine();

		j.setNombre(nombre);
		j.setAceite(aceite);
		j.setAceite2(aceite2);
		j.setFacuosa(facuosa);
		j.setAlcali(alcali);

		return j;

	}

	public static int pedirId() {

		System.out.println("Introduzca el Id del jabon");
		String id = sc.nextLine();

		int iId = Integer.parseInt(id);

		return iId;
	}

}
