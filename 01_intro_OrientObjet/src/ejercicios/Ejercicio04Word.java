package ejercicios;
import java.util.Scanner; // Este modo esta importado de la java util.

public class Ejercicio04Word {

	public static void main(String[] args) {
		//Variables
		
		int radio = 0;
		double circunferencia = 0, areaCirculo = 0; //circunf 2*PI*R area PI * r2
		
		//Obtener datos de entrada
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Teclea un numero ");
		radio = leer.nextInt();
	    circunferencia = 2* Math.PI * radio;
	    System.out.println("circunferencia " + circunferencia);
		areaCirculo = Math.PI * Math.pow(radio, 2);
		System.out.println("areaCirculo " + areaCirculo);
		
		
		leer.close();// para cerrar el flujo de lectura. 
		
		//Procesar los datos de entrada
		
		//Si es necesario escribir estadisticas
		
		
		
	}

}
