package ejercicios;
import java.util.Scanner;

public class Ejercicio011Word {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String opcion = "", nomb = "", passw = "";
		
		System.out.println("¿Que opcion quieres?");
		
		opcion = leer.next();
		
		switch (opcion) {
		
		case "validar":
			System.out.println("nombre");
			nomb = leer.next();
			System.out.println("contraseña");
			passw = leer.next();
			if (nomb.equals("Sara") && passw.equals("sarita")) {
			System.out.println("Bienvenido");
			}
			else {
				System.out.println("Lo sentimos");
			}
			
		case "registrar":
			System.out.println("Estamos registrando");
		case "cerrar sesion":
			System.out.println("cerrando sesion");
		default:
			System.out.println("opcion erronea");
				
		}
		leer.close();
		
		
		}
	}


