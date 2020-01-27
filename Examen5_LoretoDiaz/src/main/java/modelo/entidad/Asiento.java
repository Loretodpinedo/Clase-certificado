package modelo.entidad;

import java.util.ArrayList;

public class Asiento {

	private String numero;
	private String color;
	
	
	
	
	@Override
	public String toString() {
		return "Asiento /n numero: " + numero + "/n color: " + color;
	}
	
	public Asiento() {
		super();
	}
	
	public Asiento(String numero, String color) {
		super();
		this.numero = numero;
		this.color = color;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}