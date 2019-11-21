package ejercicios;
import java.util.Scanner;

public class Ejercicio01RepetitivasWord {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int numero = 0, suma = 0, contador = 0;
		
	        System.out.println("Dime un numero ");		
			numero = leer.nextInt();
			
			while (numero != 0) {
			contador++; 
			suma += numero;
			System.out.println("Dime otro numero ");
			//ojo leer al final que si no se bucla.
			numero = leer.nextInt();
			
			
			
		}
		
		System.out.println("has metido " + contador);
		System.out.println("Suman " + suma);

		leer.close();
		
	}
	

}
