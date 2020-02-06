package curso.modelo.entidad;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Pc {

	private String ram;
	private String procesador;
	private String[] arrayComponentes;
	private List<String> listaComponentes;
	
	
	@Override
	public String toString() {
		return "Ram: " + ram + "procesador: " + procesador + " Componentes: "
				+ Arrays.toString(arrayComponentes);
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
	
	
	public String[] getArrayComponentes() {
		return arrayComponentes;
	}
	public void setArrayComponentes(String[] arrayComponentes) {
		this.arrayComponentes = arrayComponentes;
	}
	public List<String> getListaComponentes() {
		return listaComponentes;
	}
	public void setListaComponentes(List<String> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}
	
	
}
