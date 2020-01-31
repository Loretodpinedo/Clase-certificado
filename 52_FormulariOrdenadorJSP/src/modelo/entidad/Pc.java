package modelo.entidad;
import java.util.Arrays;
import java.util.List;

public class Pc {

	private String ram;
	private String procesador;
	private Cliente cliente;
	private String[] arraycomponentes;
	private List<String> listaComponentes;
	private String comentarios;
	
		
	
	
	

	@Override
	public String toString() {
		return "Pc [ram=" + ram + ", procesador=" + procesador + ", cliente=" + cliente + ", arraycomponentes="
				+ Arrays.toString(arraycomponentes) + ", listaComponentes=" + listaComponentes + ", comentarios="
				+ comentarios + "]";
	}





	public String getComentarios() {
		return comentarios;
	}





	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public String[] getArraycomponentes() {
		return arraycomponentes;
	}





	public void setArraycomponentes(String[] arraycomponentes) {
		this.arraycomponentes = arraycomponentes;
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
	public String[] getComponentes() {
		return arraycomponentes;
	}
	public void setComponentes(String[] componentes) {
		this.arraycomponentes = componentes;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<String> getListaComponentes() {
		return listaComponentes;
	}


	public void setListaComponentes(List<String> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}
	
	
	
}
