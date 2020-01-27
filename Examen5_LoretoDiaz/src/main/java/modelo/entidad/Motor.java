package modelo.entidad;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Motor {

	private String cv, cilindrada;
	
	
	

	@Override
	public String toString() {
		return "Motor cv: " + cv + ", cilindrada: " + cilindrada;
	}


	public Motor() {
		super();
	}


	public Motor(String cv, String cilindrada) {
		super();
		this.cv = cv;
		this.cilindrada = cilindrada;
	}
	

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	
}
