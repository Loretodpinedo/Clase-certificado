package ejercicios;

public class Ejercicio16ExplicacionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "tomas;andres;ana;esteban;sara;ignacio;mariel";

		int [] pares = {2, 4, 6, 8, 19, 34, 68};
		String [] nombre = {"Manuel", "Nuri", "Sol", "Juancar"};
		
		pares[1]=66;
		
		for (int i=0 ; i < pares.length; i++)
			
			System.out.println("en la posicion " + i + " hay " + pares [i]);
		
		for (String cucu: nombre) {
			
			System.out.println(cucu);
			
		}
		System.out.println("\n\n");
		
		String [] nombre2 = cadena.split(";");
		for (String ele: nombre2)
			System.out.println("nombre2 " + ele);
		
		System.out.println("\n\n");
		
		for (String ele: cadena.split(";"))
			System.out.println("nombre2 " + ele);
		
		System.out.println("\n\n");
		
		
		pruebaArrayvacio ();
		
	}
	
	
	
	public static void pruebaArrayvacio() {
		
		String [] cadenas = new String [6];
		int [] numeros = new int [7];
		
		//carga del array con numero aleatorios
		for (int i=0; i< numeros.length; i+=2)
			numeros[i] = (int)(Math.random()*50+1);
		
		for (String ele: cadenas)
			System.out.println(ele);
		
		for (int ele: numeros)
			System.out.println(ele);
		
	}
}


