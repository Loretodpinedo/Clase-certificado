package tesbeans;

import beans.Animal;
import beans.Gato;

public class TestVariablesAnimal {

	public static void main(String[] args) {


		Animal a1,a2,a3,a4,a5;
		Gato gato1;
		
		a1 = new Animal("soy un pulpo de color rojizo");
		a2 = new Gato("montes - marron" , 6);
		a3 = new Animal("Camaleon - verde");
		a4 = new Gato("gatuno - marron", 2);
		
		
		a4.saludar();
		a4.sonido();
		((Gato)a4).mostrarDatos();
		
		a5 = findAnimal();
		gato1 = (Gato)findAnimal();//al ser un metodo para Animal y ser gato1 de clase Gato hay que decirselo primero.
		String tontada = (String) readObject();
		System.out.println(tontada);
		
		Gato g2 = (Gato)readObject();
	}
	
	public static Animal findAnimal( ) {
		return new Gato("callejero - blanco", 2);
		
	}

	public static Object readObject() {//devuelve cualquier objeto de cualquier clase.
		return new String ("valla tela el Tomasin ");
	}
}
