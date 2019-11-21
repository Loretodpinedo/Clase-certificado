package ejercicios;

public class Ejercicio03Word2 { 
	public static void main(String[] args) {
		
		//1 Declarar variables
		int lado1 = 0, lado2 = 0;
		int perimetro = 0;
		int area = 0;
		double hipotenusa = 0;
		
		//2 Obtener datos de entrada
		lado1 = 7; lado2 = 4;
				
		
		//3 Procesar los datos de entrada
		
		perimetro = (lado1 + lado2)*2;
		System.out.println("el resultado esperado es 22, el resultado es " + perimetro);
		area = lado1 * lado2;
		System.out.println("el resultado esperado es 28, el resultado es " + area);
		hipotenusa = Math.sqrt(lado1*lado1 + lado2*lado2);
		System.out.println("el resultado esperado es 8.06, el resultado es " + hipotenusa);
		
		//4 Si es necesario escribir estadisticas
		
		String prueba = String.valueOf(12);
		
		
		

	}

}
