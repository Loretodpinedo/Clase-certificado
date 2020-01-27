package modelo.entidad;

import java.util.ArrayList;

public class Avion {

	private String id, marca;
	private int km;
	private ArrayList<Motor>motores;
	private ArrayList<Asiento>asientos;
	private ArrayList<Rueda>ruedas;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Avion id: " + id + ", marca: " + marca + ", km: " + km + ", motores: " + motores + ", asientos: " + asientos
				+ ", ruedas: " + ruedas;
	}


	public Avion(String id, String marca, int km, ArrayList<Motor> motores, ArrayList<Asiento> asientos,
			ArrayList<Rueda> ruedas) {
		super();
		this.id = id;
		this.marca = marca;
		this.km = km;
		this.motores = motores;
		this.asientos = asientos;
		this.ruedas = ruedas;
	}
	
	
	public Avion() {
		super();
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public ArrayList<Motor> getMotores() {
		return motores;
	}
	public void setMotores(ArrayList<Motor> motores) {
		this.motores = motores;
	}
	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}
	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	public ArrayList<Rueda> getRuedas() {
		return ruedas;
	}
	public void setRuedas(ArrayList<Rueda> ruedas) {
		this.ruedas = ruedas;
	}
	
	
	
	
	
	
	
	

}
