package Servidor;

import java.util.List;

public class Coche {

	private String matricula = "", modelo = "", marca = "";
	
	
	@Override
	public String toString() {
		return "La matricula es " + matricula + ", el modelo " + modelo + " y la  marca " + marca + "\n";
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