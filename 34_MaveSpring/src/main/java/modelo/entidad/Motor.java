package modelo.entidad;

public class Motor {
	
	private String motor;
	private int cv;
	private int Cilindrada;
	
	
	
	
	@Override
	public String toString() {
		return "con un motor " + motor + ", cv " + cv + ", Cilindrada " + Cilindrada;
	}
	
	public Motor() {
		super();
	}
	
	

	public Motor(String motor, int cv, int cilindrada) {
		super();
		this.motor = motor;
		this.cv = cv;
		Cilindrada = cilindrada;
		
		
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public int getCilindrada() {
		return Cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}
	
	
	
	
	
}