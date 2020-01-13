package modelo.entidad;

import java.util.ArrayList;

public class Casa {

	private double precio;
	private Direccion direccion;
	private Persona propietario;
	private ArrayList<Habitacion> habitaciones;

	@Override
	public String toString() {
		return "Precio: " + precio + "\nDireccion: " + direccion + "\nPropietario: " + propietario
				+ "\nHabitaciones: " + habitaciones;
	}

	public Casa() {
		super();
	}

	public Casa(double precio, Direccion direccion, Persona propietario, ArrayList<Habitacion> habitaciones) {
		super();
		this.precio = precio;
		this.direccion = direccion;
		this.propietario = propietario;
		this.habitaciones = habitaciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

}