package ejercicios;
import java.util.Scanner;

public class Ejercicio10Word {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String nomb = "", contr = "";
		
		System.out.println("Usuario");
		nomb = leer.next();
		
		if (nomb.equals("Sara")) {
			System.out.println("Contraseña");
			contr = leer.next();
			if (contr.equals("sarita")) {
				System.out.println("usuario y contraseña correctos, bienvenido a la aplicacion");
			}else {
					System.out.println("Contraseña incorrecta");
			}}
		else {
		System.out.println("El nombre no es correcto");
			
				
		}
		leer.close();
		}
		
		
	

	}

    // if (nomb.equals("Sara")) && (contr.equals("sarita")){}
     
