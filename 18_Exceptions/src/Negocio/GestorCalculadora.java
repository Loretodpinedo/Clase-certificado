package Negocio;

public class GestorCalculadora {
	
	/**
	 * Metodo calcula la division entera entre dos numeros
	 * @param numerador el numerador a dividir
	 * @param denominador el denominador que vamos a usar.
	 * @return el resultado de la operacion
	 * @throws AritmeticEception cuando el denominador sea 0.
	 */
	
	public int dividir (int numerador, int denominador)
	throws ArithmeticException{
		return numerador / denominador;
				
		
	}

}
