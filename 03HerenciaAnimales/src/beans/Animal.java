package beans;

public class Animal {


		protected String color;//poniendolo protected lo veran los que lo heredan. 

	public Animal() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Animal [color=" + color + "]";
	}



	public Animal(String color) {
		super();
		this.color = color;
	}





	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void saludar ( ) {
		System.out.println("Soy un animal ");
	}
		
	public void sonido () {
	    System.out.println("Soy un animal ficticio no fucking idea del sonido que hago ");
	}

	 
	
	
	

}
