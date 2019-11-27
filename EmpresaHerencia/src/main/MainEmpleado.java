package main;

import java.util.ArrayList;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class MainEmpleado {

	public static void main(String[] args) {

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

		Director director = new Director();
		director.setNombre("Maria Cristina");
		director.setDni("12564615X");
		director.setEdad(56);
		director.setSalarioBase(40000.0);
		director.setListaEmpleados(listaEmpleados);
		
		

		Programador prog1 = new Programador();
		prog1.setNombre("Aida Maria");
		prog1.setDni("56089457L");
		prog1.setEdad(25);
		prog1.setSalarioBase(30000.00);

		listaEmpleados.add(prog1);

		Programador prog2 = new Programador();
		prog2.setNombre("Catalina");
		prog2.setDni("56084365M");
		prog2.setEdad(36);
		prog2.setSalarioBase(35000.00);

		listaEmpleados.add(prog2);

		Programador prog3 = new Programador();
		prog3.setNombre("Irene");
		prog3.setDni("5604586865M");
		prog3.setEdad(40);
		prog3.setSalarioBase(37000.00);

		Programador prog4 = new Programador();
		prog4.setNombre("Isaac");
		prog4.setDni("5608145685M");
		prog4.setEdad(38);
		prog4.setSalarioBase(36000.00);

		JefeProyecto jef1 = new JefeProyecto();
		jef1.setNombre("Pilar");
		jef1.setDni("1516845J");
		jef1.setEdad(60);
		jef1.setSalarioBase(38000.0);
		jef1.setIncentivos(1500.0);

		listaEmpleados.add(jef1);

		JefeProyecto jef2 = new JefeProyecto();
		jef2.setNombre("Vanesa");
		jef2.setDni("1561446T");
		jef2.setEdad(26);
		jef2.setSalarioBase(38000.0);
		jef2.setIncentivos(2000.0);

		/*
		 * System.out.println("El salario total de los programadores es: ");
		 * System.out.println(prog1.getNombre() + " " + prog1.getSalarioBase());
		 * System.out.println(prog2.getNombre() + " " + prog2.getSalarioBase());
		 * System.out.println(prog3.getNombre() + " " + prog3.getSalarioBase());
		 * System.out.println(prog4.getNombre() + " " + prog4.getSalarioBase());
		 * System.out.println("El salario de los jefes de proyecto es: ");
		 * System.out.println(jef1.getNombre() + " syso main " + (jef1.salarioTotal()));
		 * System.out.println(jef2.getNombre() + " " + jef2.salarioTotal());
		 * System.out.println(director.getNombre() + director.salarioTotal() +
		 * director.getListaEmpleados());
		 */
		ArrayList<Empleado> salario = new ArrayList<Empleado>();
		salario.add(jef2);
		salario.add(jef1);
		salario.add(director);
		salario.add(prog4);
		salario.add(prog3);
		salario.add(prog2);
		salario.add(prog1);

		System.out.println("Listado de salario total de cada empleado:\n ");

		for (Empleado sueldo : salario) {
			// sueldo.getClass . getName devuelve la ruta del paquete el nombre de la clase
			// .
			// System.out.println(sueldo.getClass().getName() + " "+ sueldo.getNombre() + "
			// " + sueldo.salarioTotal());

			// sueldo.getClass get.SimpleName devuelve el nombre de la clase.
			System.out.println(sueldo.getClass().getSimpleName() + " " + sueldo.getNombre() + " " + sueldo.salarioTotal());//Empleamos el polimorfismo, segun el objeto al que estemos apuntando se ejecuta un calcular un salario diferente.
			

		}

	}

}
