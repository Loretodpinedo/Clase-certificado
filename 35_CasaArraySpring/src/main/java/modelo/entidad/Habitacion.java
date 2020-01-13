package modelo.entidad;

public class Habitacion {

	private String tipo;
	private double m2;

	@Override
	public String toString() {
		return " \n " + tipo + " " + m2 + "m2";
	}

	public Habitacion() {
		super();
	}

	public Habitacion(String tipo, double m2) {
		super();
		this.tipo = tipo;
		this.m2 = m2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

}
