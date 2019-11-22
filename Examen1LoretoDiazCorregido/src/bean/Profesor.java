package bean;

import java.util.ArrayList;

public class Profesor {

	// Declaro las variables
	private String nombre = "", sexo = "", dni = "";
	private int edad = 0; 
	private double salario = 0; 
	private ArrayList<Certificado> certificado;
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", sexo=" + sexo + ", dni=" + dni + ", edad=" + edad + ", salario="
				+ salario + ", certificado=" + certificado + "]";
	}
	
	

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

	public ArrayList<Certificado> getCertificado() {
		return certificado;
	}

	public void setCertificado(ArrayList<Certificado> certificado) {
		this.certificado = certificado;
	}



	public Profesor(String nombre, String sexo, String dni, int edad, double salario,
			ArrayList<Certificado> certificado) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
		this.edad = edad;
		this.salario = salario;
		this.certificado = certificado;
	}



	public Profesor() {
		super();
	}
	
	
	

	

}
