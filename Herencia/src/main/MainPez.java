package main;

import entidad.Animal;
import entidad.PezPayaso;
import entidad.Placton;
import entidad.Trucha;

public class MainPez {

	public static void main(String[] args) {
		//NO podemos instanciar Animal por que es abstracta.
		//Anima a = new Animal ();
		
		Animal a = new Trucha ();
		a.setNombre("Ruperta");//donde apunta a ejecuta get.nombre. 
		a.setPeso(3);
		
		//a = new PezPayaso();//al hacer esto cambio la referencia a PezPayaso y Trucha desaparece. 
		Animal b = new PezPayaso();
		b.setNombre("Nemo");
		a.comer(b);
		Placton p = new Placton();
		p.setCalorias(100);
		System.out.println(a.toString());
		a.comer(p);
		System.out.println(a.toString());
	}

}
