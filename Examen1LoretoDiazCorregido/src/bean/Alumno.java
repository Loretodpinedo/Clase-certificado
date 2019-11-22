package bean;

public class Alumno {

	// Declaro las variables

	private String dni = "", nombreCompleto = "", sexo = "";
	private int edad = 0;


	// Genero el metodo ToString para poder mostrar la informacion.
	@Override
	public String toString() {
		return "El alumno con DNI " + dni + ", con nombre y apellidos " + nombreCompleto + ", de sexo " + sexo
				+ ", cuya edad es " + edad + " años" + ", esta cursando el certificado " ;
	}

	// Genero el constructor por defecto, sin ningun campo para dar valor a los
	// atributos.
	public Alumno() {
		super();
	}

	// Genero el construtor con todos los campos para dar valor a los atributos.
	public Alumno(String dni, String nombreCompleto, String sexo, int edad, Certificado certificado) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.sexo = sexo;
		this.edad = edad;
	}
		

	// Genero los getter and setter para poder acceder a las variables, ya que las
	// he declarado como privadas

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	

}
