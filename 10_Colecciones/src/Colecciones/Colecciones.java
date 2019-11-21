package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import bean.Persona;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //Creacion array de String
		ArrayList<String>listaNombres = new ArrayList<String>();
		
		//A�adimos nombres
		listaNombres.add("Mortadelo");
		listaNombres.add("Filemon");
		listaNombres.add("Dr. Bacterio");
		listaNombres.add("Ofelia");
		listaNombres.add("Super intendente Vicente");
		
		//imprimir objetos del array
		
		System.out.println(listaNombres.get(0));//Mortadelo
		System.out.println(listaNombres.get(3));//Ofelia
		System.out.println(listaNombres.size());//Dice el numero de elementos son 5.
		
		
		//Se recorren con FOR menos usada y peor. Se recorren las posiciones.
		
		for(int i = 0; i <listaNombres.size();i++) {
			System.out.println(listaNombres.get(i));//Manera poco usada de recorrer arrays o listas
			
		}
		
		//Manera buena y mas usada de recorrer una array o lista. Se recorren los valores.
		//for each
		//hay que declarar una variable dentro del for del mismo tipo de la lista que queremos recorrer : 
		//y lo siguiente 2� parte la lista que queremos recorrer. 
		
		for(String valor : listaNombres) {
			System.out.println(valor); //valor tiene el valor no la posicion.
		}
			//Para crear un array de enteros debemos usar su correspondiente Wrapper o envoltorio.
			//Todos lso primitivos tienen su propio wrapper
			//Para int = integer donde int guarda el valor e integer la posicion en memoria.
		//dos maneras de crear un objeto integer.
			
			Integer entero = new Integer(4);
			Integer entero2 = 5;//auto boxing
			//para el resto de tipos de dato se pone el nombre del dato con la 1� letra mayuscula.
			Double objetoDouble = 6.9;
			double primitivoDouble = 6.9;
			
			ArrayList<Integer>listaEnteros = new ArrayList<>();
			listaEnteros.add(1);//autoboxing
			listaEnteros.add(45);//autoboxing
			listaEnteros.add(new Integer(89));//asi se crea sin autoboxing.
			
			for (Integer v : listaEnteros) {
				System.out.println(v);
				
			}
			
			
			ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
			
			Persona p1 = new Persona();
			p1.setNombre("Penelope");
			p1.setEdad("33");
			
			Persona p2 = new Persona();
			p2.setNombre("Ana");
			p2.setEdad("45");
			
			listaPersonas.add(p1);
			listaPersonas.add(p2);
			
			for (Persona p : listaPersonas) {
			System.out.println("1- El nombre es: " + p.getNombre());
			System.out.println("2- La edad es: " + p.getEdad());
			
			//para borrar elemntos de la lista NO elimina el objeto.
			
			listaPersonas.remove(1);//Elimina por posicion.
			listaPersonas.remove(p2);//Elimina por referencia.
			System.out.println(listaPersonas);
			System.out.println(p2);
			
			p2 = null; // Borra la referencia a Ana, si no esta referenciado por otro se perdera el objeto. 
			
			//si accedemos a una posicion que no existe da error.
			
			
			
			
			System.out.println("*******Mapas****************");
			
			//Creamos mapa
			
			HashMap<String, String> mapaUsuarioContrasenia = new HashMap<String, String>();
			
			//Creamos objetos del mapa			
			mapaUsuarioContrasenia.put("Felix", "1234");
			mapaUsuarioContrasenia.put("Pepe", "qwerty");
			mapaUsuarioContrasenia.put("Pepa", "123456");
			
			//Se accede por clave o key.
			System.out.println(mapaUsuarioContrasenia.get("felix"));
			
			//Borramos objetos del mapa
			mapaUsuarioContrasenia.remove("Felix");
			
			//Si borramos una key que no existe pone el valor a null
			
			//Si cambio la clave de una kei se cambia el valor
			mapaUsuarioContrasenia.put("Pepe", "2468");//Cambio la contrase�a de Pepe.
			System.out.println(mapaUsuarioContrasenia.get("Pepe"));
			
			HashMap<String, Persona> mapaUsuarioPersona = new HashMap<String, Persona>();
			
			mapaUsuarioPersona.put(p1.getNombre(), p1);	
			mapaUsuarioPersona.put(p2.getNombre(), p2);
			
			}
		}
}

