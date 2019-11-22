package bean;

import java.util.ArrayList;

public class Certificado {

	// Declaro las variables

	private String nombreCurso = "", idCurso = "";
	private Double horas = 0.0, precio = 0.0;
	private ArrayList<Alumno> listaAlumnos;
	
	@Override
	public String toString() {
		return "Certificado [nombreCurso=" + nombreCurso + ", idCurso=" + idCurso + ", horas=" + horas + ", precio="
				+ precio + ", listaAlumnos=" + listaAlumnos + "]";
	}

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

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	

	public Certificado(String nombreCurso, String idCurso, Double horas, Double precio,
			ArrayList<Alumno> listaAlumnos) {
		super();
		this.nombreCurso = nombreCurso;
		this.idCurso = idCurso;
		this.horas = horas;
		this.precio = precio;
		this.listaAlumnos = listaAlumnos;
	}

	public Certificado() {
		super();
	}
	
	

	


	
	

}
