package ejercicios;
import java.util.Scanner;

public class Ejercicio10Word {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String nomb = "", contr = "";
		
		System.out.println("Usuario");
		nomb = leer.next();
		
		if (nomb.equals("Sara")) {
			System.out.println("Contraseņa");
			contr = leer.next();
			if (contr.equals("sarita")) {
				System.out.println("usuario y contraseņa correctos, bienvenido a la aplicacion");
			}else {
					System.out.println("Contraseņa incorrecta");
			}}
		else {
		System.out.println("El nombre no es correcto");
			
				
		}
		leer.close();
		}
		
		
	

	}

    // if (nomb.equals("Sara")) && (contr.equals("sarita")){}
     
