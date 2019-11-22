package bean;

public class Alumno {

	// Declaro las variables

	private String dni = "", nombreCompleto = "", sexo = "";// Estas las declaro como cadena de caracteres porque solo
															// me interesa la informacion que contienen.
	private int edad = 0;// Esta variable las declaro como numero entero para poder operar con los
							// valores que se le asignen.
	private Certificado certificado;// con la clase certificado vinculare a cada alumno con el certificado que
									// cursa.

	// Genero el metodo ToString para poder mostrar la informacion.
	@Override
	public String toString() {
		return "El alumno con DNI " + dni + ", con nombre y apellidos " + nombreCompleto + ", de sexo " + sexo
				+ ", cuya edad es " + edad + " años" + ", esta cursando el certificado " + certificado.getNombreCurso();
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
		this.certificado = certificado;
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

	public Certificado getCertificado() {
		return certificado;
	}

	public void setProfesor(Certificado certificado) {
		this.certificado = certificado;
	}

}
