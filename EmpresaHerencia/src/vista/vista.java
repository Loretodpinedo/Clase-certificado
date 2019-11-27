package vista;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class vista {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Empleado> listaEmpDir = new ArrayList<Empleado>();
		ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

		Programador prog1 = new Programador();
		prog1.setNombre("Aida Maria");
		prog1.setDni("56089457L");
		prog1.setEdad(25);
		prog1.setSalarioBase(30000.00);

		listaEmpleado.add(prog1);

		Programador prog2 = new Programador();
		prog2.setNombre("Catalina");
		prog2.setDni("56084365M");
		prog2.setEdad(36);
		prog2.setSalarioBase(35000.00);

		listaEmpleado.add(prog2);

		Programador prog3 = new Programador();
		prog3.setNombre("Irene");
		prog3.setDni("5604586865M");
		prog3.setEdad(40);
		prog3.setSalarioBase(37000.00);

		listaEmpleado.add(prog3);

		Programador prog4 = new Programador();
		prog4.setNombre("Isaac");
		prog4.setDni("5608145685M");
		prog4.setEdad(38);
		prog4.setSalarioBase(36000.00);

		listaEmpleado.add(prog4);

		JefeProyecto jef1 = new JefeProyecto();
		jef1.setNombre("Pilar");
		jef1.setDni("1516845J");
		jef1.setEdad(60);
		jef1.setSalarioBase(38000.0);
		jef1.setIncentivos(1500.0);

		listaEmpleado.add(jef1);

		JefeProyecto jef2 = new JefeProyecto();
		jef2.setNombre("Vanesa");
		jef2.setDni("1561446T");
		jef2.setEdad(26);
		jef2.setSalarioBase(38000.0);
		jef2.setIncentivos(2000.0);

		listaEmpleado.add(jef2);

		String opcion = "";

		System.out.println("Elija la opcion: \n" + "1- Alta empleado \n" + "2- Lista empleados \n"
				+ "3- Calculo salarios \n" + "0- Salir \n");

		opcion = sc.nextLine();

		switch (opcion) {

		case "1":
			System.out.println("Que empleado quiere dar de alta: \n" + "1- Programador \n"
					+ "2- Jefe de proyecto \n" + "3- Director \n" + "0- Salir \n");

			do {
				//System.out.println("Que empleado quiere dar de alta: \n" + "1- Programador \n"
						//+ "2- Jefe de proyecto \n" + "3- Director \n" + "0- Salir \n");

				opcion = sc.nextLine();
				if (opcion.equals("1")) {

					Empleado p = altaProgramador();
					listaEmpleado.add(p);

				} else if (opcion.equals("2")) {

					Empleado jp = altaJefeProyecto();
					listaEmpleado.add(jp);

				} else if (opcion.equals("3")) {

					Empleado d = altaDirector();

					System.out.println("¿Que empleados forman parte de tu equipo?");
					System.out.println(listaEmpleado);
					listaEmpleado.add(d);
				}					
				System.out.println("1- prog 2- jefepro 3- dir 0- salir");
				opcion = sc.nextLine();
				
			} while (!opcion.equals("0"));

			break;
		case "2":
			 System.out.println(listaEmpleado);
			
			break;
			
		case "3":
			System.out.println("Listado de salario total de cada empleado:\n ");

			for (Empleado st : listaEmpleado) {
				
				System.out.println(st.getClass().getSimpleName() + " " + st.getNombre() + " " + st.salarioTotal());//Empleamos el polimorfismo, segun el objeto al que estemos apuntando se ejecuta un calcular un salario diferente.
				}
			
			break;
		case "0":
			System.out.println("Hasta luego Maricarmen");
			default:
				System.out.println("La opcion no es correcta marque de nuevo");
		}

	}

	private static Empleado altaDirector() {

		Programador d1 = new Programador();

		System.out.println("Nombre:\n");
		String nombre = sc.nextLine();
		d1.setNombre(nombre);
		System.out.println("DNI:\n");
		String dni = sc.nextLine();
		d1.setDni(dni);
		System.out.println("Edad:\n");
		int edad = sc.nextInt();
		d1.setEdad(edad);
		System.out.println("Salario base:\n");
		double salarioBase = sc.nextDouble();
		d1.setSalarioBase(salarioBase);

		return d1;

	}

	private static Empleado altaJefeProyecto() {

		JefeProyecto jp1 = new JefeProyecto();

		System.out.println("Nombre:\n");
		String nombre = sc.nextLine();
		jp1.setNombre(nombre);
		System.out.println("DNI:\n");
		String dni = sc.nextLine();
		jp1.setDni(dni);
		System.out.println("Edad:\n");
		int edad = sc.nextInt();
		jp1.setEdad(edad);
		System.out.println("Salario base:\n");
		double salarioBase = sc.nextDouble();
		jp1.setSalarioBase(salarioBase);
		System.out.println("Incentivos: \n");
		double incentivos = sc.nextDouble();
		jp1.setIncentivos(incentivos);

		return jp1;
	}

	private static Empleado altaProgramador() {

		Programador p1 = new Programador();

		System.out.println("Nombre:\n");
		String nombre = sc.nextLine();
		p1.setNombre(nombre);
		System.out.println("DNI:\n");
		String dni = sc.nextLine();
		p1.setDni(dni);
		System.out.println("Edad:\n");
		int edad = sc.nextInt();
		p1.setEdad(edad);
		System.out.println("Salario base:\n");
		double salarioBase = sc.nextDouble();
		p1.setSalarioBase(salarioBase);
		return p1;

	}

}
