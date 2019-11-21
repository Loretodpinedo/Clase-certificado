package ejercicios;

public class EjercicioArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		
		int diaSemana = 7, ind = 0;
		
		 System.out.println("hoy es " +  dias[diaSemana-1]);//se podira poner el literal sin hacerlo variable.
	//Caso1 El array esta completo
		 
		 for (String dia: dias)//Crea la var dia tipo string y vuelca en ella el array dias.
			 System.out.println("dia Caso1 " + dia.toUpperCase());//para rcibir dias en mayus, solo si sabes que esta entero.
			 
	//Caso 2 Incompleto-sin huecos y se donde esta el tope
		 for (int i=0; i<5; i++)
			 System.out.println("dia Caso2" + dias[1]);
		 

	//Caso 3 I ncompleto-sin huecos no se donde esta el tope.(cuanto contenido tiene).
	   while (ind < dias.length && dias[ind] != null  )//Si no sabes cuantos hay y si tienen contenido.
		   System.out.println("dia caso3" + dias[ind]);
			ind++;
			
	//Caso 4 Esta incompleto con huecos.
			for (String dia: dias ) {
				if (dia != null)
					System.out.println("dia " + dia);
			}
	}

		}


