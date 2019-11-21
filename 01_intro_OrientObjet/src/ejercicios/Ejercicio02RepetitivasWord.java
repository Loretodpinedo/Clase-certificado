package ejercicios;

public class Ejercicio02RepetitivasWord {

	public static void main(String[] args) {
		  
		int contsiete = 0, conttres = 0, contmult = 0, resto = 0;
		
		
		for (int i=1; i<=250; i++) {
			
			if (i%3!= 0 && i%7!=0) {
				continue;
			}
			
					if (i%3 == 0) {
					conttres ++;
					}
					if (i%7 == 0) {
					contsiete ++;
					}
					if (i%3 == 0 && i%7 == 0) {
						contmult ++;
					}
		}
					
			System.out.println("No son multiplos " + (250-conttres-contsiete+contmult));		
			System.out.println("multiplos de 3 y 7  " + contmult);
			System.out.println("multiplos de 3 son " + conttres);
			System.out.println("multiplos de 7 son " + contsiete);
			
		
	   }
		
	}
	

	
