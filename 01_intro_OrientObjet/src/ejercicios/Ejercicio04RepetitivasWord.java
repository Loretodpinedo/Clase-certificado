package ejercicios;

public class Ejercicio04RepetitivasWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0, pares = 0, numero = 0, impares = 0, i =0;
		double media = 0;
		

		//System.out.println((int)Math.random()*50+1);
		
		for ( i=1; i<=10; i++) {
			numero = (int)(Math.random()*50+1);
			System.out.println(numero);
			 suma += numero;
			
			if (numero%2 == 0) {
				pares++;
				
			}else
					impares++;
				
			}
		System.out.println("Los numero pares son " + pares);
		System.out.println("Los numero impares son " + impares);
		System.out.println("La suma de los numeros son " + suma);
		media = (double)suma/(i-1);
		System.out.println("La media de los numeros son " + media);
			 
		}
		
}

