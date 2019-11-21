package ejercicios;

public class EjercicioMes {

	public static void main(String[] args) {
		

		int mes = 7;
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("El mes " +  mes + " es de 31 dias");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("El mes " + mes + " es de 30 dias");
		case 2:
			System.out.println("El mes " + mes + " es de 28/29 dias");
			break;
		default:
			System.out.println("Las opciones son del 1 al 12");
				
				
		}
	}

}
