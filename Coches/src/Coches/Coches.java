package Coches;

public class Coches {
	
	private String matricula = "", marca = "", modelo = "";
	
	
	@Override
	public String toString() {
		return "La marca es " + marca +", " + "El modelo es " + modelo + " y la matricula es " + matricula;
	}
	
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
