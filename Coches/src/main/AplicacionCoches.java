package main;

import java.util.ArrayList;
import java.util.Scanner;

import Coches.Coches;

public class AplicacionCoches {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		ArrayList<Coches> listaCoches = new ArrayList<Coches>();

		String opcion = "";

		do {

			System.out.println("Marca 1 para dar de alta un coche, 2 para listar los coches y 0 para salir del men�");

			opcion = leer.next();

			if (opcion.equalsIgnoreCase("1")) {

				Coches c = new Coches();

				System.out.println("�Cual es la marca?");
				c.setMarca(leer.next());
				System.out.println("�Cual es el modelo?");
				c.setModelo(leer.next());
				System.out.println("�Cual es la matricula?");
				c.setMatricula(leer.next());

				listaCoches.add(c);

				// System.out.println(c);
				// System.out.println(listaCoches);

			}
			if (opcion.equalsIgnoreCase("2")) {

				for (Coches coche : listaCoches) {
					System.out.println(coche);
				}
			}

		} while (!opcion.equalsIgnoreCase("0"));

		leer.close();
	}
}
