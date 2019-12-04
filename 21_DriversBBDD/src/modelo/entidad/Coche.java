package modelo.entidad;

public class Coche {
	
	private int id;
	private String matricula, marca, modelo;
	
	
	
	
	@Override
	public String toString() {
		return "La ID del coche es " + id + ", la matricula es " + matricula + ", la marca es " + marca + ", el modelo es " + modelo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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


	public Coche() {
		super();
	}


	public Coche(int id, String matricula, String marca, String modelo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	

}
