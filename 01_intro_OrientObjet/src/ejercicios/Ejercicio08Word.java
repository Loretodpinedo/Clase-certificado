package ejercicios;
import java.util.Scanner;

public class Ejercicio08Word {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		String pal = "";
		
		System.out.println("Dime que operacion quieres hacer");
		pal = leer.next();
		System.out.println("Dime dos números");
		num1 = leer.nextDouble();
		num2 = leer.nextDouble();
		
		switch (pal) {
		case "Sumar":
			System.out.println("El resultado es " + (num1 + num2));
			break;
		case "Restar":
		System.out.println("El resultado es " + (num1 - num2));
			break;
		case "Multiplicar":
			System.out.println("El resultado es " + (num1 * num2));
			break;
		case "Dividir":
			System.out.println("El resultado es " + (num1  / num2));
			break;
		case "Resto":
			System.out.println("El resultado es " + (num1 % num2));
			break;
		default:
			System.out.println("Opcion erronea");
		}
		
	}

}
