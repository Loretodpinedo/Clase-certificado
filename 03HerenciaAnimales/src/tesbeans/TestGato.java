package tesbeans;

import beans.Gato;

public class TestGato {
	
	public static void main(String[] args) {
		Gato gato1, gato2;
		
		gato1 = new Gato ();
		gato2 = new Gato("Manchas negras", 20);
		
		
		System.out.println(gato1 + " - " + gato2);
		gato1.saludar();
		gato2.sonido();
		gato2.mostrarDatos();
		
	}

}
