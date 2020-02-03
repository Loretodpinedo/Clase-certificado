package modelo.entidad;

public class Cliente {
	
	private String nombre;
	private String contraseña;
	
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", contraseña=" + contraseña;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
}
