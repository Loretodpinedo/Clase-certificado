package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Cliente {

	private int id;
	private String dni;
	private String nombre;
	private int edad;

	@Override
	public String toString() {
		return "El cliente con id: " + id + "\n dni: " + dni + "\n nombre: " + nombre + "\n edad: " + edad;
	}

	public Cliente(int id, String dni, String nombre, int edad) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Cliente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
