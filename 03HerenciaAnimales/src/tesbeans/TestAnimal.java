package tesbeans;

import beans.Animal;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a1,a2,a3;
		a1 = new Animal("verde");
		a2 = new Animal("rojo");
		a3 = new Animal("negro");
		
		System.out.println(a1 + " - " + a2 + " - " + a3);

		a1.saludar();
		a1.sonido();
	

	//Creo array de animales
	
	Animal [] zoologico = {a1,a2,a3};
	
	for (Animal ele: zoologico) {
		
		System.out.println(ele.getColor() + " ");
	    ele.sonido(); //ele metodo sonido hay un syso.
		
	
	
}
	}
}