package ejercicios;
import java.util.Scanner;

public class Ejercicio04realWord {

	public static void main(String[] args) {
		
	
		Scanner leer = new Scanner(System.in);	// Se pone a principio porque es una variable de ambito general. 		
				
         char sexo = 'M';
		
		if (sexo == 'H')
		System.out.println("hombre");
		else
			System.out.println("mujer");
		String sexoS = "H";
		if (sexoS == "H")
		System.out.println("Hombre String");
		else
			System.out.println("Mujer String"); 
		char sexoLeer;
		sexoLeer = leer.next().charAt(0);
		if (sexoLeer == 'H')
			System.out.println("Hombre con caracter");
		else
			System.out.println("Mujer con caracter");
		
		String sexoLeerString = null;
		sexoLeerString = leer.next();
		if (sexoLeerString.equals("H")) //para negarlo ! delante de la frase. 
			System.out.println("hombre Leer String");
		else
			System.out.println("mujer Leer String");
		
		leer.close();  //Acuerdate Lore de cerrar el Scanner.
		
	}

}

		/*char hombre = "", mujer = "";
		
		Scanner leer = new Scanner(System.in);		
		System.out.println("Escribe H si eres hombre o M si eres mujer ");
		
		
		hombre = leer.nextLine();
		
		if (hombre == "H") {
				System.out.println("eres hombre ");
		}
		
		}

} */

		
			