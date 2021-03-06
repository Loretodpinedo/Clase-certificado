package Main;

import java.util.ArrayList;

import bean.Direccion;
import bean.Persona;

public class MainPersona {
	
	public static void main(String[] args) {
		
		//Creacion objeto con el constructor vacio.
		
		Persona p1 = new Persona ();
		Persona pAux = p1;
		p1.setNombre("Bud Espencer");
		p1.setEdad(89);
		p1.setPeso(120);
		
		//Creacion objeto 2� manera con el constructor con campos.
		
		Persona p2 = new Persona("Terence Hill", 67, 70);
		
		pAux.setEdad(33);//Con esto la edad de p1 y pAux cambia a 33. 
		System.out.println(p1.getEdad());
		cambiarEdad(p1);//aounta al nuevo metodo.
		System.out.println(p1.getEdad());
		
		p2 = pAux;
		
		int numero = 50;
		cambiarEntero(numero);
		System.out.println(numero);
		
		          //tipo de objetos que utiliza.
		ArrayList <Persona> listaPersona = new ArrayList<Persona>();
		
		Persona p3 = new Persona();
		listaPersona.add(p3);//apunta p3 a la primera dir libre del arraylist.
		p3.setNombre("Harry Potter");
		p3.setEdad(19);
		p3.setPeso(56);
		
		//para modificar el objeto se puede hacer de 2 modos en este caso
		p3.setEdad(20);
		//listaPersona.get(0).setEdad(20);
		
		listaPersona.add(pAux);//a�ado pAux al arraylist.
		pAux = null; //hago que pAux apunte a nulo (dibujo en rojo).
		
		int cp = 28034;
		
		
		
		System.out.println(listaPersona.get(0));
		
		Persona p4 = new Persona();
		p4.setNombre("Mortadelo");
		p4.setEdad(80);
		p4.setPeso(70);
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Gran Via");
		d1.setCiudad("Madrid");
		d1.setCp("28046");

		p4.setDireccion(d1);//la direccion d1 es asignada a la persona p4
		
		listaPersona.add(p4);//A�ade p4 a listaPersona.
	}
	
	public static void cambiarEdad(Persona p) {
		p.setEdad(45);
	}
	
	public static void cambiarEntero(int numero) {
		numero = 100;
	}
	
	
	}


