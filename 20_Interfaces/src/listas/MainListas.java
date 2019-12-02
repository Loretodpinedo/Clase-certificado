package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainListas {

	public static void main(String[] args) {
		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("pepe");
		listaString.add("pepa");
		
		//Las interfaces con una coleccion de metodos
		//abstractos. Sierven para varias osas, entre ellas 
		//implemntar una herencia multiple en java
		//con una referencia de una interface, podemos
		//apuntar a cualquier objeto que implemnete dicha interface.
		//Las interfaces dicen el "QUE"  mientras de las clases que
		//implementan dicha interface diecen el "COMO"
		
		//Ejemplo, la clase ArrayList es una implementacion 
		//de la interfaz List, que por debajo utiliza
		//arrays nomales de java, y cuando se llena, crea uno
		//nuevo mas grande. 
		
		List<String> listaNombres = new ArrayList <String>();//Referenciando desde la interface puedo hacer un metodo para todas las implementaciones. 
		listaNombres.add("pepe");
		listaNombres.add("pepa");
		
		LinkedList<String>  listaLinked = new LinkedList<String>();
		ArrayList<String> listaArray = new ArrayList<String>();
		Vector<String> listaVector = new Vector<String>();	
	}
		
		private static void recorrerLinked(LinkedList<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
			}
		}
		private static void recorrerArray(ArrayList<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
			}
		}
		private static void recorrerVector(Vector<String>lista) {
			//trabajos con los datos de la lista
			for (String s : lista) {
				System.out.println(s);
			}
		}
		

	}


