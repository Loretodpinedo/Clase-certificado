package tesbeans;

import beans.Animal;
import beans.Gato;

public class TestZoologico {

	public static void main(String[] args) {

		Animal a1 = new Animal("Camaleon - verde");
		Animal a2 = new Animal("Hipotatimo - marron");
		
		
		Gato gato1 = new Gato("gato siames", 7);
		Gato gato2 = new Gato("callejero", 5);
		
		//a1.sonido();
		//gato1.sonido();
		
		Animal [] zoo = {a1,a2,gato1,gato2};//Puedo meter en un array cualquier referencia a objetos
											//de padres a hijos.
		
			for (Animal ele: zoo) {
				ele.sonido();//ejecutara en a1 Animal y en gato1 Gato.
			if (ele instanceof Gato) {// para que encuentre Gato y reconozca que tiene metodos propios.
				
				((Gato) ele).mostrarDatos();//ha hecho un casting a Gato.
				
			
				
			}
		}
	}
}
