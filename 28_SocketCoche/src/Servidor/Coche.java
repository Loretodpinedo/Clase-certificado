package Servidor;

import java.util.List;

public class Coche {

	private String id = "", matricula = "", modelo = "", marca = "";
	
	
	

	@Override
	public String toString() {
		return "La id del coche es " + id + ", la matricula " + matricula + ", el modelo " + modelo + " y la  marca " + marca;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	

}