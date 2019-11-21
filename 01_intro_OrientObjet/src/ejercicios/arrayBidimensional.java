package ejercicios;

public class arrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] dias = {"lunes","martes","miercoles","jueves","viernes"};
		
		//Con esta fila digo que el string es bidireccional
		String [][]	menus = {
				
				{"macarrones","lomo","sandia"},
				{"sopa","garbanzos","apaño","cafe","copa"},
				{"acelgas","pechuga plancha","melon","cafe}"},
				{"lenteja","carne guisada","piña"},
				{"ensalada","rabo de toro","tarta"}
				
		};
		System.out.println("MENU DE ESTA SEMANA");
		for (int i =0; i< menus.length; i++) {
			System.out.println("\n" + dias[1].toUpperCase());
			for (int j=0; j < menus[i].length; j++) {
				System.out.println(menus[i][j] + " - ");
			}
				
		}
}
		}
	

