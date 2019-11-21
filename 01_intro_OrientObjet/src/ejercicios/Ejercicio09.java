package ejercicios;
import java.util.Scanner;

public class Ejercicio09 {

	private static final int PI = 0;

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
				
		double num1 = 0, num2 = 0;
		double result2 = 0, result = 0;
		String fig = "";
		
		
		System.out.println("Dime que quieres calcular");
		fig = leer.next();
		System.out.println("Ahora dime dos números");
		num1 = leer.nextDouble();
		num2 = leer.nextDouble();
		
		switch (fig) {
		
		case "triangulo":
			result = (num1 * num2) / 2; 
			System.out.println("El area del triangulo es " + result);
			break;
		case "rectangulo":
			result = (num1 * 2) + (num2 * 2);
			result2 = num1 * num2;
			System.out.println("El perímetro del rectangulo es " + result + " y el área del rectangulo es " + result2);
			break;
		case "circulo":
			result = num1 * Math.PI;
			result2 = Math.pow(num2, 2) * Math.PI;
			//result2 = (num2 * num2) * Math.PI;circulo
			System.out.println("La circunferencia del circulo es " + result + " y el area del circulo es " + result);
			break;
		default:
			
		
		}
		
		leer.close();
	}
	
	
	

}
