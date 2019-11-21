package ejercicios;
import java.util.Scanner;

public class Ejercicio07Word {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);		
		int num = 0;
		
		System.out.println("Teclea un numero del 1 al 3 y te dire como se escribe");
		
		num = leer.nextInt();
		switch (num) {
		
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3: 
			System.out.println("Tres");
			break;
		default:
			System.out.println("Otro número");
			
		}
		
	}

}
