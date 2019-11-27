package entidad;

import java.util.ArrayList;

public class Director extends Empleado {

	private ArrayList<Empleado> listaEmpleados;
	//Public static final double VARIABLE_POR_EMPLEADO; CREANDO ESTA VARIABLE SE PUEDE SABER CUAL ES LA VARIABLE DEL SUELDO DEL DIRECTOR. 

	
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
