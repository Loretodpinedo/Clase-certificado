package main;

import java.util.Scanner;

public class MainExcepcionesEjercicio {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

			
		
		try {
		System.out.println("introduzca el nominador:");
		int num1 = sc.nextInt();
		System.out.println("introduzca el denominador:");
		int num2 = sc.nextInt();
		 
		
		int resultado = num1 / num2;
		
		
		System.out.println("El resultado es " + resultado);
		
		
		}catch (ArithmeticException ae) {
			do {
			
			System.out.println("No se puede dividir por 0, introduzca de nuevo los operadores ");
			
			
			
		System.out.println("Fin del programa, gracias por usarlo.");
	
		//ae.printStackTrace();
		//podemos imprimir toda la traza.
		//System.out.println (ae.getMessage());
		
	}while (!ae.equals(null));
	sc.nextLine();
	}
	}
	}


