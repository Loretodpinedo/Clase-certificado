package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
	/*	String nombre = "Sebastian";
		System.out.println(nombre.toUpperCase());//ctr /
		System.out.println(String.valueOf(1234).substring(1, 3));
		*/
		int num1=0 , num2=2 , resultado = 0; //simulamos que los leemos
		num1 = 15;
		num2 = 25;
		resultado = 0;
		//proceso
		resultado = num1+num2;
		System.out.println("la suma es : " + (num1 + num2));
		System.out.println("la suma es " + resultado);
		System.out.println("la resta es " + (num1 - num2));
		System.out.println("el resto es " + (num1 * num2));
		System.out.println("la division es " + (num1 / num2));
		System.out.println("el resto de la division es " + (num1 % num2));
		
	}

}
