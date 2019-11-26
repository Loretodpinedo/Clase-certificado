package entidad;

import java.util.ArrayList;

public class Director extends Empleado {
	
	private ArrayList <Empleado> listaEmpleados;

	@Override
	public double salarioTotal() {
		
		return (getSalarioBase() + (listaEmpleados.size()) * 100);
		
		
	}
		
		


	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
	

}
