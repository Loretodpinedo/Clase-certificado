package bean;

import java.util.ArrayList;

public class Casa {
	
	private double precio;
	private Persona propietario;
	private Direccion direccion;
	private ArrayList<Habitacion>listaHabitacion;
	
	
	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}
	public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "El precio del alquiler es " + precio + "€" + ", el propietario es " + propietario + ", la direccion es " + direccion
				+ "consta de esta habitaciones " + listaHabitacion + "]";
	}
	
	
	
	
	

}
