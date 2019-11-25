package main;

import entidad.Persona;

public class MainEstatico {

	// observar que este metodo es estatico
	// Es decir, este metodo no esta ligado a ningun objeto.
	// Existe siempre sin necesidad de new.
	public static void main(String[] args) {

		Persona p1 = new Persona();
		// para acceder al metodo setNombre accedo
		// a traves de la referencia al objeto.
		p1.setNombre("Harry Calahan");
		p1.setEdad(85);

		System.out.println(p1);
		// como lo estatico existe siempre esto lo puedo hacer.
		imprimirEstatico(p1);
		// para invocar un metodo dinamico necesito el objeto creado.
		// fijate en p1.setNombre
		// Creamos el objeto
		MainEstatico mainEstatico = new MainEstatico();
		// Ahora si podemos invocar el metodo.
		mainEstatico.imprimirDinamico(p1);
		// Da error por desde lo estatico no podemos acceder a lo dinamico.
		// imprimirDinamico(p1));

		// Si no estoy dentro de la clase que tiene el atributo o el metodo
		// estatico, se accede a traves del nombre de la clase.
		Persona.numeroPersonas++;
		// notese la diferencia entre cuando queria aaceder a un metodo o
		// atributo dinamico, que lo necesitaba era una referencia al objeto.
	}

	public static void imprimirEstatico(Persona p1) {
		System.out.println(p1);
	}

	public void imprimirDinamico(Persona p1) {
		System.out.println(p1);
	}

}
