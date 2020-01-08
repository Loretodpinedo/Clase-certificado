
import java.util.Scanner;

public class MainVideojuego {

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
		
		/*System.out.println("En que equipo esta tu personaje ");
		Equipo equipo = FabricaEquipos
		*/

		person.atacar();
     

		sc.close();
	}

}
