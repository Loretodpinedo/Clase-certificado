package bean;

public class Habitacion {

	private double m2;
	private String tipo;
	
	
	
	

	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return tipo + " con " + m2 + "m2";
	}
	
	
	
	
}
