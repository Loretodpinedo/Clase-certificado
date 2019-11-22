package bean;

public class Profesor {

	// Declaro las variables
	private String nombre = "", sexo = "", dni = "";// Estas las declaro como cadena de caracteres porque solo me
													// interesa la informacion que contienen.
	private int edad = 0; // Esta variable las declaro como numero entero para poder operar con los
							// valores que se le asignen.
	private double salario = 0; // Esta variable la declaro double porque el salario puede tener decimales.

	// Genero el metodo ToString para poder mostrar la informacion.
	@Override
	public String toString() {
		return "El profesor " + nombre + ", cuyo sexo es " + sexo + ", con DNI " + dni + ", y con la edad de " + edad
				+ ", tiene un salario de " + salario + "€";
	}

	// Genero el constructor por defecto, sin ningun campo para dar valor a los
	// atributos.
	public Profesor() {
		super();
	}

	// Genero el construtor con todos los campos para dar valor a los atributos.
	public Profesor(String nombre, String sexo, String dni, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
		this.edad = edad;
		this.salario = salario;
	}

	// Genero los getter and setter para poder acceder a las variables, ya que las
	// he declarado como privadas

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
