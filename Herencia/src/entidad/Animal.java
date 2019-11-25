package entidad;

public abstract class Animal {
	
	//Esta es la clase padre de todas.
	protected String nombre = "";
	private double peso = 0;
	private int edad = 0;
	
	
	public abstract void comer (Object comida);
	
	
	


	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", getNombre()=" + getNombre()
				+ ", getPeso()=" + getPeso() + ", getEdad()=" + getEdad() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}





	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
