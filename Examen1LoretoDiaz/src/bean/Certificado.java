package bean;

public class Certificado {

	// Declaro las variables

	private String nombreCurso = "", idCurso = "";// Estas variables las declaro como cadena de caracteres porque solo
													// me interesa la informacion que guardan.
	private Double horas = 0.0, precio = 0.0;// Estas variables las declaro como doubles porque pueden contener numero
												// con decimales con los que podria querer operar.
	Profesor profesor;// Esta variable de clase Profesor la declaro para adjudicar un profesor al
						// certificado.

	// Genero el metodo ToString para poder mostrar la informacion.

	@Override
	public String toString() {
		return "El certificado a impartir tiene el nombre de " + nombreCurso + ", idCurso" + idCurso + ", consta de "
				+ horas + " horas" + ", su precio es de " + precio + "€" + ", esta impartido por el profesor "
				+ profesor.getNombre();
	}// modifico el metodo ToString para que muestre los datos como yo quiero.

	// Genero el constructor por defecto, sin ningun campo para dar valor a los
	// atributos.

	public Certificado() {
		super();
	}

	// Genero el construtor con todos los campos para dar valor a los atributos.
	public Certificado(String nombreCurso, String idCurso, Double horas, Double precio, Profesor profesor) {
		super();
		this.nombreCurso = nombreCurso;
		this.idCurso = idCurso;
		this.horas = horas;
		this.precio = precio;
		this.profesor = profesor;
	}

	// Genero los getter and setter para poder acceder a las variables, ya que las
	// he declarado como privadas

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
