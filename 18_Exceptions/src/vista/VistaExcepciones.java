package vista;


import java.util.InputMismatchException;
import java.util.Scanner;

import Negocio.GestorCalculadora;

public class VistaExcepciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Introduce los numeros");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			GestorCalculadora gc = new GestorCalculadora();
			int resultado = gc.dividir(n1, n2);
			
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
			//e.printStackTrace();
		}catch (InputMismatchException ime) {
			System.out.println("No se admiten letras");
		}

	}


}
