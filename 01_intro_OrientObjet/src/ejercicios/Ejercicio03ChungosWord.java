package ejercicios;
import java.util.Scanner;

public class Ejercicio03ChungosWord {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int  importe = 0, cont50 = 0, cont20 = 0, cont10 = 0,cont5 = 0, acumulador = 0, pago = 0, vuelta = 0;
		
		
		
		
		System.out.println("El importe es ");
		importe = leer.nextInt();
		System.out.println("Importe para el pago");
		pago = leer.nextInt();
		System.out.println("la vuelta es "  + ( pago - importe));
		
		
		vuelta = pago - importe;
		
		while (vuelta != 0)   {
			
			if (vuelta%50 != 0) {
				cont50 ++;
				acumulador = vuelta - 50;
			
			}else {
				if (vuelta%20 !=0) {
					cont20 ++;
					acumulador = acumulador - 20;
					}else {
						if (vuelta%10 !=0) {
							cont10 ++;
							acumulador = acumulador - 10;
						}
					}
				System.out.println("10 " + cont10 + "20 " + cont20 + "50 " + cont50);
			}
			
			
		}
		
		
				
		
		

	}

}
