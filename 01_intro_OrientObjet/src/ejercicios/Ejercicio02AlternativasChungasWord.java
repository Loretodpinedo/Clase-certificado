package ejercicios;

public class Ejercicio02AlternativasChungasWord {
	
	static double comision = 0, salario = 0, aumento = 0, subida = 0; //hace las variables de la clase, seran compartidos por todos los metodos, se va comartir con  todo el que use la clase.
	

	public static void main(String[] args) {
		
				//double comision = 0, salario = 0;
		
		salario = 12000;
		aumento = 0;
		comision = 0;
		
	   
		
		if (comision == 0) {
			
			verSalario();
			 
		}else {
			verComision();
			 
		}
		System.out.print("El salario era " + salario);
		System.out.print("\tLa subida es  " + subida + "%");
		System.out.print("\tEl aumento es " + aumento);
		System.out.println("\tEl salario final es " + (salario + aumento));
		
	}
		
		private static void verSalario() { //Crear metodo dentro del main.
			
			if (salario < 15000) {
				subida = 10;
				aumento =salario*subida/100;
				
				}else {if (salario >= 15000 && salario < 30000) {
					subida = 8;
					aumento = salario * subida/100;
				 }else {if (salario >= 30000 && salario < 45000) {
					 subida = 4;
					 aumento = salario * subida/100;
				 }else {
					 subida = 0;
					 aumento = 0;
				 }
			}
				}
		}
		private static void verComision() { //Crear metodo dentro del main.
			if (comision < 2000 ) {
				subida = 12;
				aumento = salario * subida/100;
			}else {if (comision >= 2000 && comision < 10000) {
				subida = 6;
				aumento = salario * subida/100;
			}else {
				System.out.println("Sin aumento");
			}
			}

		}
}

