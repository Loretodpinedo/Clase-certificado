package modelo.entidad;

import java.util.ArrayList;

public class Pc {

	private String ram;
	private String procesador;
	private Cliente cliente;
	private ArrayList<Componente> componentes;
	
		
	
	@Override
	public String toString() {
		return "Pc [ram=" + ram + ", procesador=" + procesador + ", componentes=" + componentes + "]";
	}
	

	public Pc(String ram, String procesador, ArrayList<Componente> componentes, Cliente cliente) {
		super();
		this.ram = ram;
		this.procesador = procesador;
		this.componentes = componentes;
		this.cliente = cliente;
	}
	
	
	public Pc() {
		super();
	}
	
	

	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public ArrayList<Componente> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
