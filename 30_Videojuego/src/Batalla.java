import java.util.Scanner;

public class Batalla {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tipo = null;
		String nombre = null;

		System.out.println("¿De que tipo es tu personaje?");
		tipo = sc.nextLine();
		Personaje person = FabricaPersonajes.crear(tipo);
		System.out.println("¿Como se llama tu personaje?");
		nombre = sc.nextLine();
		person.setNombre(nombre);
		System.out.println("¿Que arma tiene tu personaje?");

		Arma arma = FabricaArmas.crear(sc.nextLine());
		person.setArma(arma);

		System.out.println("¿De que tipo es tu personaje rival?");
		tipo = sc.nextLine();
		Personaje person2 = FabricaPersonajes.crear(tipo);
		System.out.println("¿Como se llama tu personaje rival?");
		nombre = sc.nextLine();
		person2.setNombre(nombre);
		System.out.println("¿Que arma tiene tu personaje rival?");

		Arma arma2 = FabricaArmas.crear(sc.nextLine());
		person2.setArma(arma2);

		System.out.println("El combate entre " + person.getNombre() + " con arma " + person.getArma() + " y "
				+ person2.getNombre() + " con arma " + person2.getArma() + " va a comenzar ");

		person.atacarPersonaje(person2);

		System.out.println("El " + person.getClass() + " " + person.getNombre() + " tiene " + person.getVida()
				+ " de vida mientras que el " + person2.getClass() + " " + person2.getNombre() + " tiene "
				+ person2.getVida() + " de vida");

		System.out.println("El combate sigue y esta vez es el " + person2.getClass() + " " + person2.getNombre()
				+ " quien ataca al " + person.getClass() + " " + person.getNombre());

		person2.atacarPersonaje(person);

		System.out.println("El resultado es que el " + person2.getClass() + " " + person2.getNombre()
				+ " tiene de vida " + person2.getVida() + " y  el " + person.getClass() + " " + person.getNombre()
				+ " tiene de vida " + person.getVida());

		sc.close();

	}
}
