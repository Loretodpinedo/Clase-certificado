package modelo.entidad;

public class Componente {
	
	private String tipo;
	
	
	
	

	@Override
	public String toString() {
		return "Componente [tipo=" + tipo + "]";
	}
	

	public Componente() {
		super();
	}

	public Componente(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
