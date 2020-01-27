package modelo.entidad;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	
	@Autowired
	private ArrayList<Avion> aviones;
	
	
	
	
	
	@Override
	public String toString() {
		return "Aeropuerto nombre: " + nombre + ", ciudad: " + ciudad + "\n" + " aviones: " + aviones;
	}


	public Aeropuerto() {
		super();
	}


	public Aeropuerto(String nombre, String ciudad, ArrayList<Avion> aviones) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.aviones = aviones;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public ArrayList<Avion> getAviones() {
		return aviones;
	}
	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}
	
	

}
