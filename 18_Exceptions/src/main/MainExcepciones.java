package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExcepciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Este bloque es el que java va a intentar ejecutar,
		// si algun error ocurre en vez de terminar el programa entraria por la parte
		// del bloque
		// catch.

		boolean repetir = true;// doy por echo que el usuario se va a equivocar y habra que repetir el do.

		do {
			try {

				System.out.println("introduzca el nominador:");
				int num1 = sc.nextInt();
				System.out.println("introduzca el denominador:");
				int num2 = sc.nextInt();
				// si ponemos el num2 con un cero, nos da un error en tiempo de ejecucion y el
				// programa se para.

				int resultado = num1 / num2;
				// Rn caso de excepcion deja de ejecutar el bloque try.

				System.out.println("El resultado es " + resultado);

				repetir = false;// en caso de que el resulado se imprima, el usuario no se ha equivocado no se
								// repetira el do.
				// la variable ae guarda informacion del error.
			} catch (ArithmeticException ae) {
				// si ocurre una excepcion en el bloque try de tipo ArithmeticException entrara
				// por
				// aqui.
				System.out.println("No se puede dividir por 0");

				// muestra la traza.
				// ae.printStackTrace();
				// podemos imprimir toda la traza.
				// System.out.println (ae.getMessage());
			} catch (InputMismatchException ime) {
				System.out.println("No admite caracteres.");
				sc.nextLine();// para que no se quede buclado el syso.
				// Para cualquier error
			} catch (Exception e) {
				System.out.println("Error insesperado");

			}
		} while (repetir);
		System.out.println("Fin del programa, gracias por usarlo.");
	}
	
}
