package beans;

public class Gato extends Animal{//estoy dandole la herencia de Animal

	private int vidas;

	

	//constructor con herencia de Animal
	public Gato(String color, int vidas) {
	super(color);//herencia de Animales
	this.vidas = vidas;//mio
}
	//constructor sin herencia, sin nada. 
	
	public Gato() {
		super();
		this.getColor(); //Para usar un metodo private heredado. 
	

	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public void mostrarDatos() {
		System.out.println("Vidas " + vidas);
		System.out.println("Color " +  color);
	}
	
	public void trepar () {
		System.out.println("Trepo que lo flipas");
	}

	
	
	@Override
	public String toString() {
		return "Gato [color=" + color + ", vidas=" + vidas + "]";
	}
	
	//Metodos reescritos de mi padre boton derecho tostring

	@Override
	public void saludar() {
			//super.saludar QUITAR!!!
		System.out.println("Soy un gato y tengo " + vidas + " vidas");
	}

	@Override
	public void sonido() {
		
		//QUITAR!!!! super.sonido
		System.out.println("Soy " + color + " y digo MIAAAUUUUUU");
	}
	
	
	
	
	
}

