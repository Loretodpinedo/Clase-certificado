package entidad;

public abstract class Empleado {

	private String dni = "", nombre = "";
	private int edad = 0;
	private double salarioBase = 0.0;

	public abstract double salarioTotal();
	
	
	

	@Override
	public String toString() {
		return "Empleado con nombre " + nombre + ", DNI " + dni + ", edad" + edad + ", salarioBase" + salarioBase +"€.\n";
	}



	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
